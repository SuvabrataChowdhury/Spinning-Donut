package utility.constants;

import utility.dataTypes.Point2D;

public class ScreenConstants{

    public enum size{
        DEFAULT_SCREEN_WIDTH(50),
        DEFAULT_SCREEN_HEIGHT(50);

        private final int valueInPixels;
        size(int pixels) {
            this.valueInPixels = pixels;
        }

        public int getValueInPixels() {
            return valueInPixels;
        }
    }

    public enum center{
        SCREEN_CENTER(
            new Point2D<Integer,Integer>(ScreenConstants.size.DEFAULT_SCREEN_WIDTH.getValueInPixels()/2,
                                        ScreenConstants.size.DEFAULT_SCREEN_HEIGHT.getValueInPixels()/2
                                        )
            );

        private final Point2D<Integer,Integer> center;
        center(Point2D<Integer,Integer> center){
            this.center = center;
        }

        public Point2D<Integer,Integer> getCenter(){
            return center;
        }
    }
}