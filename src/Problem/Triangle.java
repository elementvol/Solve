package Problem;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ara
 * Date: 13.09.14
 * Time: 22:10
 * To change this template use File | Settings | File Templates.
 */
public class Triangle implements Figure {
    public static int COUNT_OF_VERTEX=3;
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c)
    {

          this.a = a;
          this.b = b;
          this.c = c;


      }

    public boolean consistsPoint(Point d)
    {
     double detA,detB,detC;
     detA = (a.getX()-d.getX())*(b.getY()-a.getY())-(a.getY()-d.getY())*(b.getX()-a.getX());
     detB = (b.getX()-d.getX())*(c.getY()-b.getY())-(b.getY()-d.getY())*(c.getX()-b.getX());
     detC = (c.getX()-d.getX())*(a.getY()-c.getY())-(c.getY()-d.getY())*(a.getX()-c.getX());
     if((detA>=0&detB>=0&detC>=0)|(detA<=0&detB<=0&detC<=0)) return true;
     else return false;
    }
    public int pointsInside(ArrayList<Point> list)
    {
        int count = 0;
        for (Point point : list)
        {
          if(this.consistsPoint(point)) count++;
        }
       return count;
    }

    @Override
    public String toString() {

        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    public static boolean DOES_NOT_EXISTS(Point a, Point b, Point c)
    {

       return  Point.POINTS_ON_LINE(a,b,c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

       if(((a.equals(triangle.a)&b.equals(triangle.b)&c.equals(triangle.c)))|
        ((a.equals(triangle.b)&b.equals(triangle.a)&c.equals(triangle.c)))|
        ((a.equals(triangle.c)&c.equals(triangle.a)&b.equals(triangle.b)))|
        ((a.equals(triangle.b)&b.equals(triangle.c)&c.equals(triangle.a)))|
        ((a.equals(triangle.c)&b.equals(triangle.a)&c.equals(triangle.b)))|
        ((a.equals(triangle.a)&b.equals(triangle.c)&c.equals(triangle.b)))) return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = a.hashCode();
        result = 31 * result + b.hashCode();
        result = 31 * result + c.hashCode();
        return result;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }
}
