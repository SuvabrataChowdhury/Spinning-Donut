package spinningDonut.elements;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import utility.dataTypes.Point2D;

public interface Item {

    //Definition
    public List<Point2D> getPixels();
    public void setPixels(final List<Point2D> pixels);

    public Point2D getCenter();

    //Movements
    public void translate(final Point2D trFactor);
    public void moveTo(final Point2D dest);
}