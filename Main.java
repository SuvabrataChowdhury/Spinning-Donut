import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import spinningDonut.elements.Item;
import spinningDonut.elements.Screen;
import spinningDonut.elements.Square;
import spinningDonut.exceptions.ScreenCreationException;
import utility.constants.ScreenConstants;
import utility.constants.Thickness;
import utility.dataTypes.Point2D;
import utility.logging.LoggUtil;

//TODO: Make Relative Positioning Possible
//TODO: Be able to group items
class Main{
    private static LoggUtil LOGGER = LoggUtil.getInstance(Main.class.getName());

    public static void main(String[] args) throws SecurityException, IOException, ScreenCreationException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {

        try {
            Screen screen = Screen.getInstance(100,100);

            Square face = new Square(20);
            face.moveTo(screen.getCenter());

            Square eye1 = new Square(5);
            eye1.moveTo(screen.getCenter());
            eye1.translate(new Point2D(-5,-5));

            Square eye2 = new Square(5);
            eye2.moveTo(screen.getCenter());
            eye2.translate(new Point2D(5,-5));

            Square mouth = new Square(5);
            mouth.moveTo(screen.getCenter());
            mouth.translate(new Point2D(0,5));

            Square body = new Square(30);
            body.moveTo(screen.getCenter());
            body.translate(new Point2D(0,25));

            Square rightArm = new Square(10);
            rightArm.moveTo(screen.getCenter());
            rightArm.translate(new Point2D(-20,15));

            Square leftArm = new Square(10);
            leftArm.moveTo(screen.getCenter());
            leftArm.translate(new Point2D(20,15));

            Square rightLeg = new Square(7);
            rightLeg.moveTo(screen.getCenter());
            rightLeg.translate(new Point2D(-15,43));

            Square leftLeg = new Square(7);
            leftLeg.moveTo(screen.getCenter());
            leftLeg.translate(new Point2D(15,43));

            screen.addItems(face,eye1,eye2,mouth,body,rightArm,leftArm,rightLeg,leftLeg);

            screen.render(Thickness.DEFAULT);
            
        } catch (SecurityException | IOException | ScreenCreationException exception) {
          
            LOGGER.severe("Exception",exception);
        }

        System.out.println("Will be rendering dount");
    }
}