import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import spinningDonut.elements.GroupItems;
import spinningDonut.elements.Item;
import spinningDonut.elements.Line;
import spinningDonut.elements.Screen;
import spinningDonut.elements.Square;
import spinningDonut.exceptions.ScreenCreationException;
import utility.constants.ScreenConstants;
import utility.constants.Thickness;
import utility.dataTypes.Point2D;
import utility.logging.LoggUtil;

//TODO: Make Relative Positioning Possible
//TODO: Be able to group items [Done]
//TODO: Refactor GroupItems so that it acts as an Item
class Main{
    private static LoggUtil LOGGER = LoggUtil.getInstance(Main.class.getName());

    public static void main(String[] args) throws SecurityException, IllegalArgumentException {

        try {
            Screen screen = Screen.getInstance(100,100);

            Point2D start = new Point2D(10,10);
            Point2D end = new Point2D(80,80);
            Line line = new Line(start,end);

            screen.addItem(line);
            screen.render(Thickness.DEFAULT);
            
        } catch (SecurityException | IOException | ScreenCreationException exception) {
          
            LOGGER.severe("Exception",exception);
        }

        System.out.println("Will be rendering dount");
    }
}