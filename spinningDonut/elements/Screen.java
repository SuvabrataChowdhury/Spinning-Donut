package spinningDonut.elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import utility.constants.ScreenConstants;
import utility.constants.Thickness;
import utility.dataTypes.Point2D;
import utility.logging.LoggUtil;
import spinningDonut.exceptions.*;

public class Screen {
    private static Screen instance = null;

    private static final LoggUtil LOGGER = LoggUtil.getInstance(Screen.class.getName());

    private final int width;
    private final int height;

    private List<Item> items;
    private Frame frame;

    //Create a default screen
    private Screen() throws SecurityException, IOException{
        LOGGER.info("Creating new Screen");
       
        this.width = ScreenConstants.size.DEFAULT_SCREEN_WIDTH.getValueInPixels();
        this.height = ScreenConstants.size.DEFAULT_SCREEN_HEIGHT.getValueInPixels();
        this.items = new ArrayList<>();
        this.frame = new Frame(this.width,this.height);

        LOGGER.info("Instansiated Default Screen: "+this);
    }

    //Create a user-defined screen 
    private Screen(int width,int height,List<Item> items) throws SecurityException, IOException{
        LOGGER.info("Creating new Screen");

        this.width = width;
        this.height = height;
        this.items = items;
        this.frame = new Frame(this.width,this.height);

        LOGGER.info("Instansiated User Defined Screen: "+this);
    }

    public static Screen getInstance() throws SecurityException, IOException, ScreenCreationException{
        if(null == Screen.instance)
            Screen.instance = new Screen();
        else
            LOGGER.warning("Attempting to recreate screen");

        return Screen.instance;
    }

    public static Screen getInstance(int width,int height,List<Item> items) throws SecurityException, IOException, ScreenCreationException{
        if(null != Screen.instance)
            throw new ScreenCreationException("Screen already exists");

        Screen.instance = new Screen(width,height,items);
        return Screen.instance;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void addItem(Item item, Point2D<Integer,Integer> itemCenterPos) {
        item.moveCenter(itemCenterPos);
        this.items.add(item);
    }

    public void render(Thickness thickness) {
        items.stream().forEach(item -> {
            item.getPixels().stream().forEach(pixel -> frame.plot(pixel,thickness));
        });

        frame.display();
    }

    @Override
    public String toString() {
        return "Screen [width=" + width + ", height=" + height + ", items=" + String.valueOf(items) + "]";
    }
}