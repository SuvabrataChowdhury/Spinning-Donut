package spinningDonut.elements;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import utility.dataTypes.Point2D;

public class GroupItems implements Item{
    private List<Item> items;
    private Point2D center;

    public GroupItems(Item ... items){
        this.items = new ArrayList<>();
        this.center = new Point2D();
        
        this.construct(items);
    }

    @Override
    public List<Point2D> getPixels() {
        List<Point2D> pixels = new ArrayList<>();
        items.stream().forEach(item -> {
            pixels.addAll(item.getPixels());
        });

        return pixels;
    }

    @Override
    public void setPixels(List<Point2D> pixels) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPixels'");
    }

    @Override
    public Point2D getCenter() {
        return this.center;
    }

    @Override
    public void moveTo(Point2D dest) {
        Point2D trFactor = Point2D.getDisplacement(this.center, dest);
        
        this.translate(trFactor);
    }

    @Override
    public void translate(Point2D trFactor){
        items.stream().forEach(item -> {
            item.translate(trFactor);
       });
    }

    public List<Item> getItems() {
        return this.items;
    }

    private void construct(Item ... items) {
        for(Item item : items){
            this.items.add(item);
            this.center.setX(this.center.getX() + item.getCenter().getX());
            this.center.setY(this.center.getY() + item.getCenter().getY());
        }

        this.center.setX(this.center.getX()/this.items.size());
        this.center.setY(this.center.getY()/this.items.size());
    }
}
