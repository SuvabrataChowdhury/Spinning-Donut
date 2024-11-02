import java.io.IOException;
import java.util.ArrayList;

import spinningDonut.elements.Screen;
import spinningDonut.exceptions.ScreenCreationException;
import utility.logging.LoggUtil;

class Main{
    private static LoggUtil LOGGER = LoggUtil.getInstance(Main.class.getName());

    public static void main(String[] args) throws SecurityException, IOException, ScreenCreationException {

        try {
            Screen screen1 = Screen.getInstance();
            Screen screen2 = Screen.getInstance(500,500,new ArrayList<>());
            
        } catch (SecurityException | IOException | ScreenCreationException exception) {
            // TODO Auto-generated catch block
            System.out.println("Exception");
            LOGGER.severe("Exception",exception);
            // LOGGER.severe("Exception Generated: ",exception);
        }

        Screen screen3 = Screen.getInstance();
        Screen screen4 = Screen.getInstance();
        Screen screen5 = Screen.getInstance();
        Screen screen6 = Screen.getInstance();

        // System.out.println("Screen created: \n"+screen);
        //Shape shape = new Donut(Utils.DEFAULT_DONUT_INNER_RADIUS,Utils.DEFAULT_DONUT_OUTER_RADIUS);

        // Animation animation = new Animation(screen,AnimationUtils.DEFAULT_FRAME_RATE);
        // animation.animate(shape,AnimationUtils.ActionUtils.ROTATE_XYZ);

        System.out.println("Will be rendering dount");
    }
}