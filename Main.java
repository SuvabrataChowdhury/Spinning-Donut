import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import spinningDonut.elements.Item;
import spinningDonut.elements.Screen;
import spinningDonut.elements.Square;
import spinningDonut.exceptions.ScreenCreationException;
import utility.constants.Thickness;
import utility.dataTypes.Point2D;
import utility.logging.LoggUtil;

class Main{
    private static LoggUtil LOGGER = LoggUtil.getInstance(Main.class.getName());

    public static void main(String[] args) throws SecurityException, IOException, ScreenCreationException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {

        try {
            Screen screen = Screen.getInstance(100,100);

            Square preSquare = new Square(10);
            preSquare.translate(new Point2D(5,5));
            screen.addItem(preSquare);

            for(int sideLength=preSquare.getSideLength()+5;;sideLength+=5){
                Square square = new Square(sideLength);
                square.moveTo(preSquare.getBottomRight());

                if(screen.isOutside(square))
                    break;
                screen.addItem(square);
                preSquare = square;
            }

            // Square centerSquare = new Square(20);
            // centerSquare.moveTo(screen.getCenter());

            // Square square1 = new Square(10);
            // Point2D topLeft = centerSquare.getTopLeft();
            // square1.moveTo(topLeft);

            // Square square2 = new Square(10);
            // Point2D topRight = centerSquare.getTopRight();
            // square2.moveTo(topRight);

            // Square square3 = new Square(10);
            // square3.moveTo(centerSquare.getBottomLeft());

            // Square square4 = new Square(10);
            // square4.moveTo(centerSquare.getBottomRight());

            // screen.addItems(centerSquare,square1,square2,square3,square4);

            screen.render(Thickness.DEFAULT);
            
        } catch (SecurityException | IOException | ScreenCreationException exception) {
          
            LOGGER.severe("Exception",exception);
        }

        System.out.println("Will be rendering dount");
    }
}