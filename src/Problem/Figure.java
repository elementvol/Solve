package Problem;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ara
 * Date: 14.09.14
 * Time: 15:06
 * To change this template use File | Settings | File Templates.
 */
public interface Figure {
    public boolean consistsPoint(Point point);
    public int pointsInside(ArrayList<Point> list);

}
