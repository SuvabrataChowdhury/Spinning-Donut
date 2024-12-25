package spinningDonut.elements;

import java.util.ArrayList;
import java.util.List;

import utility.dataTypes.Point2D;

public class Line implements Item {

  private List<Point2D> pixels;

  private Point2D center;

  public Line(Point2D start, Point2D end) {
    this.pixels = new ArrayList<>();
    this.center = new Point2D(start.getX() + end.getX() / 2, start.getY() + end.getY() / 2);

    this.construct(start, end);
  }

  @Override
  public List<Point2D> getPixels() {
    return this.pixels;
  }

  @Override
  public void setPixels(List<Point2D> pixels) {
    this.pixels = pixels;
  }

  @Override
  public Point2D getCenter() {
    return this.center;
  }

  @Override
  public void translate(Point2D trFactor) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'translate'");
  }

  @Override
  public void moveTo(Point2D dest) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'moveTo'");
  }

  public void construct(final Point2D start, final Point2D end) {
    double incrX,incrY;
    int dx = end.getX() - start.getX();
    int dy = end.getY() - start.getY();

    int steps = Math.max(dx, dy);

    incrX = dx/(double)steps;
    incrY = dy/(double)steps;

//    System.out.println(incrX + " " + incrY);

    steps = Math.abs(steps);

    double x = start.getX();
    double y = start.getY();
    for(int i=0;i<steps;i++){
      this.pixels.add(new Point2D((int) x,(int) y));

      x += incrX;
      y += incrY;

//      System.out.println(point);
    }

//    System.out.println(this.pixels);
  }
}
