package utility.constants;

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
    
}