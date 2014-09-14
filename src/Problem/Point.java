package Problem;

/**
 * Created with IntelliJ IDEA.
 * User: ara
 * Date: 13.09.14
 * Time: 22:10
 * To change this template use File | Settings | File Templates.
 */
public class Point {
    double x;
    double y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public static boolean POINTS_ON_LINE(Point a, Point b, Point c)
    {
      return (b.x-a.x)*(c.y-a.y)-(b.y-a.y)*(c.x-a.x)==0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (Double.compare(point.x, x) != 0) return false;
        if (Double.compare(point.y, y) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "point(x= "+x +";" + "y="+ y+")";
            //To change body of overridden methods use File | Settings | File Templates.
    }
}
