import java.io.IOException;

import spinningDonut.elements.Item;
import spinningDonut.elements.Screen;
import spinningDonut.elements.Square;
import spinningDonut.exceptions.ScreenCreationException;
import utility.constants.ScreenConstants;
import utility.constants.Thickness;
import utility.dataTypes.Point2D;
import utility.logging.LoggUtil;

class Main{
    private static LoggUtil LOGGER = LoggUtil.getInstance(Main.class.getName());

    public static void main(String[] args) throws SecurityException, IOException, ScreenCreationException {

        try {
            Screen screen = Screen.getInstance();

            Item square = new Square(10);
            //square.move(ScreenConstants.position.DEFAULT_SCREEN_CENTER.getCenter());
            square.move(screen.getCenter());
            screen.addItem(square);

            Item square1 = new Square(20);
            square1.move(screen.getCenter());
            screen.addItem(square1);

            Item square2 = new Square(10);
            //square2.placeInScreen(ScreenConstants.positions.TOP_RIGHT);
            square2.move(new Point2D(screen.getWidth()-6,screen.getHeight()-6));
            //screen.addItem(square2);

            // Item square3 = new Square(10);
            // screen.addItem(square3);

            // Square square4 = new Square(10);
            // square4.moveCenter(new Point2D<>((screen.getWidth()-1)-5,5));
            // screen.addItem(square4);

            Point2D center = screen.getCenter();
            //square2.move(new Point2D(center.getX()-44, center.getY()-44));
            screen.addItem(square2);

            screen.render(Thickness.DEFAULT);
            
        } catch (SecurityException | IOException | ScreenCreationException exception) {
          
            LOGGER.severe("Exception",exception);
        }

        System.out.println("Will be rendering dount");
    }
}