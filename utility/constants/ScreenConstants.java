package utility.constants;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import utility.dataTypes.Point2D;

public class ScreenConstants{

    public enum size{
        DEFAULT_SCREEN_WIDTH(50),
        DEFAULT_SCREEN_HEIGHT(50);

        private final int valueInPixels;
        size(final int pixels) {
            this.valueInPixels = pixels;
        }

        public int getValueInPixels() {
            return valueInPixels;
        }
    }

    public enum position{
        DEFAULT_ITEM_CENTER_IN_SCREEN(new Point2D(0,0));

        private final Point2D itemCenter;
        position(final Point2D itemCenter){
            this.itemCenter = itemCenter;
        }

        public Point2D getItemCenter() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
            //TODO: Make it more readable
            return itemCenter.getClass().getDeclaredConstructor(new Class<?>[0]).newInstance(new Object[0]);
        }
    }
    
}