package spinningDonut.elements;

import java.util.List;

import utility.constants.ScreenConstants;
import utility.dataTypes.Point2D;

public class Square extends Item {
    private int sideLength;
    private Point2D center = ScreenConstants.position.DEFAULT_ITEM_CENTER_IN_SCREEN.getItemCenter();

    public Square(final int sideLength){
        this.sideLength = sideLength;
        this.construct();
    }

    public int getSideLength() {
        return sideLength;
    }

    public Point2D getCenter(){
        return this.center;
    }

     //TODO: Construct square with Bresenham lines
     @Override
     public void construct(){
        //  Point2D point = this.findTopLeft();
         Point2D point = this.getTopLeft();
 
         List<Point2D> pixels = this.getPixels();
         pixels.add(new Point2D(point.getX(),point.getY()));
 
         for(int i=0;i<this.sideLength;i++){
             //Move point
             point.setX(point.getX()+1);
 
             //Construct Top edge
             pixels.add(new Point2D(point.getX(),point.getY()));
 
             //Construct Left edge
             pixels.add(new Point2D(point.getY(),point.getX()));
 
             //Construct bottom edge
             pixels.add(new Point2D(point.getX(),point.getY()+this.sideLength));
 
             //Construct right edge
             pixels.add(new Point2D(point.getY()+this.sideLength, point.getX()));
         }
 
         this.setPixels(pixels);
     }

    @Override
    public void translate(final Point2D trFactor){
        this.center.setX(this.center.getX()+trFactor.getX());
        this.center.setY(this.center.getY()+trFactor.getY());

        this.getPixels().stream().forEach(pixel -> {
            pixel.translate(trFactor);
        });
    }

    @Override
    public void moveTo(final Point2D dest){
        Point2D displacementToDest = Point2D.getDisplacement(this.center,dest);

        this.center.setX(dest.getX());
        this.center.setY(dest.getY());

        this.getPixels().stream().forEach(pixel -> {
            pixel.translate(displacementToDest);
        });
    }
 
    private Point2D findTopLeft(){
        Point2D result = new Point2D();
        
        result.setX(this.center.getX()-this.sideLength/2);
        result.setY(this.center.getY()-this.sideLength/2);

        return result;
    }

    public Point2D getTopLeft(){
        return new Point2D(this.center.getX()-this.sideLength/2,this.center.getY()-this.sideLength/2);
    }

    public Point2D getTopRight(){
        return new Point2D(this.center.getX()+this.sideLength/2,this.center.getY()-this.sideLength/2);
    }

    public Point2D getBottomLeft(){
        return new Point2D(this.center.getX()-this.sideLength/2,this.center.getY()+this.sideLength/2);
    }

    public Point2D getBottomRight(){
        return new Point2D(this.center.getX()+this.sideLength/2,this.center.getY()+this.sideLength/2);
    }


}
