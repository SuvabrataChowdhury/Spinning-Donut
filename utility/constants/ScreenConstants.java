package utility.constants;

public enum ScreenConstants {
    DEFAULT_SCREEN_WIDTH(250),
    DEFAULT_SCREEN_HEIGHT(250);

    private final int valueInPixels;

    ScreenConstants(int pixels) {
        this.valueInPixels = pixels;
    }

    public int getValueInPixels() {
        return valueInPixels;
    }
}
