package utility.dataTypes;

public class Point2D {
    private Integer x;
    private Integer y;

    public Point2D() {
        //Defaults to null
    }

    public Point2D(final Integer x,final Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(final Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(final Integer y) {
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

    

    // public void addAndSet(Point2D<Integer> vec) {
    //     if(this.x instanceof Integer && this.y instanceof Integer){
    //         this.setX(this.getX()+vec.getX());
    //         this = new Point2D<Integer>((Integer)this.getX()+vec.getX(),(Integer)this.getY()+vec.getY());
    //     }
    // }

    
}
