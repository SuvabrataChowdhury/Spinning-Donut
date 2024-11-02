import java.io.IOException;
import java.util.ArrayList;

import spinningDonut.elements.Item;
import spinningDonut.elements.Screen;
import spinningDonut.elements.Shape;
import spinningDonut.elements.Square;
import spinningDonut.exceptions.ScreenCreationException;
import utility.constants.ScreenConstants;
import utility.constants.Thickness;
import utility.logging.LoggUtil;

class Main{
    private static LoggUtil LOGGER = LoggUtil.getInstance(Main.class.getName());

    public static void main(String[] args) throws SecurityException, IOException, ScreenCreationException {

        try {
            Screen screen = Screen.getInstance(35,35,new ArrayList<>());

            Shape square = new Square(5);
            screen.addItem((Item)square,ScreenConstants.center.SCREEN_CENTER.getCenter());
            screen.render(Thickness.DEFAULT);
            
        } catch (SecurityException | IOException | ScreenCreationException exception) {
          
            LOGGER.severe("Exception",exception);
        }

        System.out.println("Will be rendering dount");
    }
}