package spinningDonut.elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import utility.constants.ScreenConstants;
import utility.logging.LoggUtil;

public class Screen {
    private final LoggUtil LOGGER = new LoggUtil(this.getClass().getName());

    private final int width;
    private final int height;

    private List<Item> items;

    //Create a default screen
    public Screen() throws SecurityException, IOException{
       
        this.width = ScreenConstants.DEFAULT_SCREEN_WIDTH.getValueInPixels();
        this.height = ScreenConstants.DEFAULT_SCREEN_HEIGHT.getValueInPixels();
        this.items = new ArrayList<>();

        LOGGER.info("Instansiated Default Screen: "+this);
    }

    //Create a user-defined screen
    public Screen(int width,int height,List<Item> items) throws SecurityException, IOException{

        this.width = width;
        this.height = height;
        this.items = items;

        LOGGER.info("Instansiated User Defined Screen: "+this);
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