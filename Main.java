import java.io.IOException;

import spinningDonut.elements.Item;
import spinningDonut.elements.Screen;
import spinningDonut.elements.Square;
import spinningDonut.exceptions.ScreenCreationException;
import utility.constants.Thickness;
import utility.dataTypes.Point2D;
import utility.logging.LoggUtil;

class Main{
    private static LoggUtil LOGGER = LoggUtil.getInstance(Main.class.getName());

    public static void main(String[] args) throws SecurityException, IOException, ScreenCreationException {

        try {
            Screen screen = Screen.getInstance();

            Square centerSquare = new Square(20);
            centerSquare.moveTo(screen.getCenter());

            Square square1 = new Square(5);
            square1.moveTo(centerSquare.getTopLeft());

            Square square2 = new Square(5);
            square2.moveTo(centerSquare.getTopRight());

            Square square3 = new Square(5);
            square3.moveTo(centerSquare.getBottomLeft());

            Square square4 = new Square(5);
            square4.moveTo(centerSquare.getBottomRight());

            // screen.addItems(centerSquare);
            //screen.addItems(centerSquare,square1);
            screen.addItems(centerSquare,square1,square2);
            // screen.addItems(centerSquare,square1,square2,square3);
            // screen.addItems(centerSquare,square1,square2,square3,square4);

            screen.render(Thickness.DEFAULT);
            
        } catch (SecurityException | IOException | ScreenCreationException exception) {
          
            LOGGER.severe("Exception",exception);
        }

        System.out.println("Will be rendering dount");
    }
}