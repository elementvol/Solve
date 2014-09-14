package Problem;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ara
 * Date: 14.09.14
 * Time: 0:23
 * To change this template use File | Settings | File Templates.
 */
public class SetOfPoints {
    ArrayList<Point> list = new ArrayList<Point>();
    public SetOfPoints(ArrayList<Point> list) {
      this.list = list;
    }
    public ArrayList<Triangle> buildTriangles ()
    {
        ArrayList<Triangle> list  = new ArrayList<Triangle>();
        for(int i = 0 ; i < this.list.size(); i++)
        {
            for(int j = 0 ;j < this.list.size(); j++)
            {

                for(int k = 0 ; k<this.list.size();k++)
               {
                 if(!Triangle.DOES_NOT_EXISTS(this.list.get(i), this.list.get(j),this.list.get(k))){

                     boolean match = false;
                     Triangle triangle = new Triangle(this.list.get(i), this.list.get(j),this.list.get(k));
                     for (int l = 0 ;l <list.size();l++ )
                     {
                         if(triangle.equals(list.get(l))) {match = true;
                        break; }
                     }
                     if (!match) {
                     list.add(new Triangle(this.list.get(i),this.list.get(j),this.list.get(k))); }


                 }

               }


            }
        }
    return list;
    }

}
