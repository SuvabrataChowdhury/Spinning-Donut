package spinningDonut.elements;

import java.util.ArrayList;
import java.util.List;

import utility.dataTypes.Point2D;

public class GroupItems {
    private List<Item> items;
    private Point2D center;

    public GroupItems(Item ... items){
        this.items = new ArrayList<>();
        this.center = new Point2D();

        for(Item item : items){
            this.items.add(item);
            this.center.setX(this.center.getX() + item.getCenter().getX());
            this.center.setY(this.center.getY() + item.getCenter().getY());
        }

        this.center.setX(this.center.getX()/this.items.size());
        this.center.setY(this.center.getY()/this.items.size());
    }

    public void moveTo(Point2D dest) {
        Point2D trFactor = Point2D.getDisplacement(this.center, dest);
        
        this.translate(trFactor);
    }

    public void translate(Point2D trFactor){
        items.stream().forEach(item -> {
            item.translate(trFactor);
       });
    }

    public List<Item> getItems() {
        return this.items;
    }
}
