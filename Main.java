import java.io.IOException;
import java.util.ArrayList;

import spinningDonut.elements.Screen;
import spinningDonut.exceptions.ScreenCreationException;

class Main{

    public static void main(String[] args) {

        try {
            //Screen screen1 = Screen.getInstance();
            Screen screen2 = Screen.getInstance(500,500,new ArrayList<>());
            // Screen screen3 = Screen.getInstance();
            // Screen screen4 = Screen.getInstance();
            // Screen screen5 = Screen.getInstance();
            // Screen screen6 = Screen.getInstance();
        } catch (SecurityException | IOException | ScreenCreationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // System.out.println("Screen created: \n"+screen);
        //Shape shape = new Donut(Utils.DEFAULT_DONUT_INNER_RADIUS,Utils.DEFAULT_DONUT_OUTER_RADIUS);

        // Animation animation = new Animation(screen,AnimationUtils.DEFAULT_FRAME_RATE);
        // animation.animate(shape,AnimationUtils.ActionUtils.ROTATE_XYZ);

        System.out.println("Will be rendering dount");
    }
}