package spinningDonut.elements;

import java.util.ArrayList;
import java.util.List;
import utility.dataTypes.Point2D;

public class Item {
    private List<Point2D> pixels;
    //TODO: Field to hold lighting info

    public Item() {
        this.pixels = new ArrayList<>();
    }

    public Item(List<Point2D> pixels) {
        this.pixels = pixels;
    }

    public List<Point2D> getPixels() {
        return pixels;
    }

    public void setPixels(List<Point2D> pixels) {
        this.pixels = pixels;
    }

    @Override
    public String toString() {
        return "Item [pixels=" + pixels + "]";
    }

    public void move(Point2D trFactor) {
        this.pixels.stream().forEach(pixel -> {
            pixel.setX(pixel.getX()+trFactor.getX());
            pixel.setY(pixel.getY()+trFactor.getY());

            // pixel.addAndSet(trFactor);
        });
    }
}