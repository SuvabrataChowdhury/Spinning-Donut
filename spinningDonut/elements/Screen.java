package spinningDonut.elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import utility.constants.ScreenConstants;
import utility.logging.LoggUtil;
import spinningDonut.exceptions.*;

public class Screen {
    private static Screen instance = null;

    private static final LoggUtil LOGGER = LoggUtil.getInstance(Screen.class.getName());

    private final int width;
    private final int height;

    private List<Item> items;

    //Create a default screen
    private Screen() throws SecurityException, IOException{
        LOGGER.info("Creating new Screen");
       
        this.width = ScreenConstants.DEFAULT_SCREEN_WIDTH.getValueInPixels();
        this.height = ScreenConstants.DEFAULT_SCREEN_HEIGHT.getValueInPixels();
        this.items = new ArrayList<>();

        LOGGER.info("Instansiated Default Screen: "+this);
    }

    //Create a user-defined screen
    private Screen(int width,int height,List<Item> items) throws SecurityException, IOException{
        LOGGER.info("Creating new Screen");

        this.width = width;
        this.height = height;
        this.items = items;

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

    @Override
    public String toString() {
        //String itemString = ((null == items)? "null" : items.toString());
        return "Screen [width=" + width + ", height=" + height + ", items=" + String.valueOf(items) + "]";
    }
}