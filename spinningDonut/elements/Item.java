package spinningDonut.elements;

import java.util.ArrayList;
import java.util.List;
import utility.dataTypes.Point2D;

public class Item {
    private List<Point2D<Integer,Integer>> pixels;
    //TODO: Field to hold lighting info

    public Item() {
        this.pixels = new ArrayList<>();
    }

    public Item(List<Point2D<Integer, Integer>> pixels) {
        this.pixels = pixels;
    }

    public List<Point2D<Integer, Integer>> getPixels() {
        return pixels;
    }

    public void setPixels(List<Point2D<Integer, Integer>> pixels) {
        this.pixels = pixels;
    }

    @Override
    public String toString() {
        return "Item [pixels=" + pixels + "]";
    }

    
}