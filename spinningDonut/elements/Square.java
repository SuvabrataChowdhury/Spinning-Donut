package spinningDonut.elements;

import java.util.List;

import utility.dataTypes.Point2D;

public class Square extends Item implements Shape {
    private Point2D<Integer,Integer> center = new Point2D<>(0,0);
    private int sideLength;
    
    public Square(int sideLength){
        this.sideLength = sideLength;
        this.construct();
    }

    //TODO: Construct square with Bresenham lines
    private void construct(){
        Point2D<Integer,Integer> point = this.findTopLeft();

        List<Point2D<Integer,Integer>> pixels = this.getPixels();
        for(int i=1;i<=10;i++){
            //Move point
            point.setX(point.getX()+1);

            //Construct Top edge
            pixels.add(new Point2D<>(point.getX(),point.getY()));

            //Construct Left edge
            pixels.add(new Point2D<>(point.getY(),point.getX()));

            //Construct bottom edge
            pixels.add(new Point2D<>(point.getX(),point.getY()+this.sideLength));

            //Construct rigth edge
            pixels.add(new Point2D<>(point.getY()+this.sideLength, point.getX()));
        }

        this.setPixels(pixels);
    }

    private Point2D<Integer,Integer> findTopLeft(){
        Point2D<Integer,Integer> result = new Point2D<>();
        
        result.setX(this.center.getX()-this.sideLength/2);
        result.setY(this.center.getY()-this.sideLength/2);

        return result;
    }

    @Override
    public void moveCenter(Point2D dest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveCenter'");
    }

}
