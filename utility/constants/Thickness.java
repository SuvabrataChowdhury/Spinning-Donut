package utility.constants;

public enum Thickness {
    DEFAULT('\\');

    private final char plotChar;

    Thickness(final char plotChar){
        this.plotChar = plotChar;
    }

    public char getPlotChar(){
        return this.plotChar;
    }
}