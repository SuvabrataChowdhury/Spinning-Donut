package utility.dataTypes;

public class Point2D {
    private Integer x;
    private Integer y;

    public Point2D() {
        //Defaults to null
    }

    public Point2D(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }

    // public void addAndSet(Point2D<Integer> vec) {
    //     if(this.x instanceof Integer && this.y instanceof Integer){
    //         this.setX(this.getX()+vec.getX());
    //         this = new Point2D<Integer>((Integer)this.getX()+vec.getX(),(Integer)this.getY()+vec.getY());
    //     }
    // }

    
}
