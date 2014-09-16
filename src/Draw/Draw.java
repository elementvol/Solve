package Draw;

import javafx.scene.shape.Polyline;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

/**
 * Created with IntelliJ IDEA.
 * User: ara
 * Date: 16.09.14
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public class Draw extends JPanel{
    public Draw()
    {
        JFrame frame = new JFrame("Frame");
        frame.setLocation(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        frame.getContentPane().add(this);
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.BLACK);
        g2.translate(250, 250);
        g2.drawLine(-250,0,250,0);
        g2.drawLine(0,-250,0,250);
        g2.drawOval(-20,-20,40,40);



       Ellipse2D.Double ellipse2D = new Ellipse2D.Double(-50,-50,100,100);
       ((Graphics2D) g).draw(ellipse2D);
        double[]x = {10,15,16,17};
        double[]y = {36,44,13,96};
        GeneralPath polyline = new GeneralPath(GeneralPath.WIND_EVEN_ODD,x.length);
        polyline.moveTo(10,36);
        for(int i = 1 ;i < x.length; i++)
        {
            polyline.lineTo(x[i], y[i]);
        }
        polyline.closePath();
        g2.draw(polyline);



    }
    public static void main(String[] args)
    {
        Draw draw = new Draw();
    }
}
