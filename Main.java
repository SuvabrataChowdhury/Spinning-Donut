import java.io.IOException;
import java.util.ArrayList;

import spinningDonut.elements.Screen;

class Main{

    public static void main(String[] args) {

        try {
            Screen screen1 = new Screen();
            Screen screen2 = new Screen(500,500,new ArrayList<>());
            Screen screen3 = new Screen();
            Screen screen4 = new Screen();
            Screen screen5 = new Screen();
            Screen screen6 = new Screen();
        } catch (SecurityException | IOException e) {
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