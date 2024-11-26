package utility.dataTypes;

public class Point2D {
    private int x;
    private int y;

    public Point2D() {
       this.x = 0;
       this.y = 0;
    }

    public Point2D(final int x,final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }

    public static Point2D getDisplacement(final Point2D src, final Point2D dest) {
        return new Point2D(dest.getX()-src.getX(),dest.getY()-src.getY());
    }

    public void translate(final Point2D trFactor) {
        this.setX(this.getX()+trFactor.getX());
        this.setY(this.getY()+trFactor.getY());
    }

    

    // public void addAndSet(Point2D<int> vec) {
    //     if(this.x instanceof int && this.y instanceof int){
    //         this.setX(this.getX()+vec.getX());
    //         this = new Point2D<int>((int)this.getX()+vec.getX(),(int)this.getY()+vec.getY());
    //     }
    // }

    
}
