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

// public abstract class Item {
//     private List<Point2D> pixels;
//     private Point2D center;
    
//     //TODO: Field to hold lighting info

//     public Item() {
//         this.pixels = new ArrayList<>();
//     }

//     public Item(final List<Point2D> pixels) {
//         this.pixels = pixels;
//     }

//     public List<Point2D> getPixels() {
//         return pixels;
//     }

//     public void setPixels(final List<Point2D> pixels) {
//         this.pixels = pixels;
//     }

//     @Override
//     public String toString() {
//         return "Item [pixels=" + pixels + "]";
//     }

//     public abstract void translate(final Point2D trFactor);

//     public abstract void moveTo(final Point2D dest);

//     //public abstract void construct();

//     public Point2D getCenter() {
//         return center;
//     }

//     // private void setCenter(Point2D center) {
//     //     this.center = center;
//     // }

//     // public void updateCenter(Point2D center){
//     //     this.setCenter(center);
//     // }

//     //TODO: Make it more general so that both screen and items work
//     // public boolean isOutside(Screen screen){
//     //     return this.pixels.stream().filter(pixel -> 
//     //         ((pixel.getX()<0 || pixel.getX()>=screen.getWidth()) || (pixel.getY() < 0 || pixel.getY()<screen.getHeight()))
//     //     ).collect(Collectors.toList()).isEmpty();
//     // }
// }