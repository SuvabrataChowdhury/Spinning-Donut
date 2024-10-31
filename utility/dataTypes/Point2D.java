package utility.dataTypes;

public class Point2D <K,T> {
    private K x;
    private T y;

    public Point2D() {
        //Defaults to null
    }

    public Point2D(K x, T y) {
        this.x = x;
        this.y = y;
    }

    public K getX() {
        return x;
    }

    public void setX(K x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }

    
}
