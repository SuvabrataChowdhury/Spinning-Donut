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
            Screen screen = Screen.getInstance();

            Item square = new Square(25);
            screen.addItem(square,ScreenConstants.position.DEFAULT_SCREEN_CENTER.getCenter());

            // Item square1 = new Square(20);
            // screen.addItem(square1,ScreenConstants.position.DEFAULT_SCREEN_CENTER.getCenter());

            Item square2 = new Square(15);
            screen.addItem(square2,ScreenConstants.position.DEFAULT_SCREEN_CENTER.getCenter());

            // Item square3 = new Square(10);
            // screen.addItem(square3,ScreenConstants.position.DEFAULT_SCREEN_CENTER.getCenter());

            Item square4 = new Square(5);
            screen.addItem(square4,ScreenConstants.position.DEFAULT_SCREEN_CENTER.getCenter());

            screen.render(Thickness.DEFAULT);
            
        } catch (SecurityException | IOException | ScreenCreationException exception) {
          
            LOGGER.severe("Exception",exception);
        }

        System.out.println("Will be rendering dount");
    }
}