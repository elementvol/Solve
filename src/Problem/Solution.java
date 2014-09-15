package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ara
 * Date: 13.09.14
 * Time: 22:11
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
       public static  void main(String[] args) throws IOException {
         BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
         ArrayList<Point>list = new ArrayList<Point>();
         ArrayList<Triangle> triangles = new ArrayList<Triangle>();
         String inX,inY;
         while(true)
         {
             inX=r.readLine();
             if(inX.isEmpty())break;
             inY=r.readLine();
             if(inY.isEmpty()) break;
             else {
               list.add(new Point(Double.parseDouble(inX),Double.parseDouble(inY)));
             }


         }
         for (Point point :list)
         {
             System.out.println(point);
         }
         triangles =  new SetOfPoints(list).buildTriangles();
         for (Triangle triangle : triangles)
         {
             System.out.println(triangle);
         }
           maxCountOfPointsConsists(triangles,list);
           r.readLine();
           r.close();

       // System.out.println(new Triangle(new Point(1,1),new Point(1,2),new Point (3,2)).consistsPoint(new Point(3,1)));
       }
      public static void maxCountOfPointsConsists(ArrayList<Triangle> triangles , ArrayList<Point> points)
       {

           int maxCount=triangles.get(0).pointsInside(points);
           int indexOfTriangle=0;
           for (int i = 1 ; i < triangles.size(); i++)
           {
              if(triangles.get(i).pointsInside(points)>maxCount){ maxCount=triangles.get(i).pointsInside(points);
                  indexOfTriangle = i;
              }
           }
           System.out.println(triangles.get(indexOfTriangle)+" Count of points inside: "+maxCount);




       }





}


