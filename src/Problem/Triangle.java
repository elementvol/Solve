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
    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c)
    {

          this.a = a;
          this.b = b;
          this.c = c;


      }

    public boolean consistsPoint(Point d)
    {
     double detA,detB,detC;
     detA = (a.x-d.x)*(b.y-a.y)-(a.y-d.y)*(b.x-a.x);
     detB = (b.x-d.x)*(c.y-b.y)-(b.y-d.y)*(c.x-b.x);
     detC = (c.x-d.x)*(a.y-c.y)-(c.y-d.y)*(a.x-c.x);
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
}
