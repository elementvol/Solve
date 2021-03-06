package Draw;

import Problem.Triangle;
import javafx.scene.shape.Polyline;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ara
 * Date: 16.09.14
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public class Draw extends JPanel {
    ArrayList<Triangle> triangles;
    private static int WIDTH_OF_FRAME;
    private static int LENGTH_OF_FRAME;
    public Draw(ArrayList<Triangle> triangles, int WIDTH_OF_FRAME,int LENGTH_OF_FRAME)
    {
        this.WIDTH_OF_FRAME = WIDTH_OF_FRAME;
        this.LENGTH_OF_FRAME = LENGTH_OF_FRAME;
        this.triangles = triangles;
        JFrame frame = new JFrame("Frame");
      //  JPanel panel = new JPanel();
        frame.setLocation(500,500);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(this.WIDTH_OF_FRAME, this.LENGTH_OF_FRAME);
        frame.setMinimumSize(new Dimension(this.WIDTH_OF_FRAME, this.LENGTH_OF_FRAME));
        frame.setMaximumSize(new Dimension(this.WIDTH_OF_FRAME, this.LENGTH_OF_FRAME));

        frame.getContentPane().add(this);
    //    frame.getContentPane().add(panel);
      // this.setFocusPainted(false);
       // this.setBorderPainted(false);
       // this.setEnabled(false);


    }

    @Override
    public void paintComponent(Graphics g) {

       // super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.BLACK);
        g2.translate(this.getWidth()/2, this.getHeight()/2);
        g2.drawLine(-this.getWidth()/2,0,this.getWidth()/2,0);
        g2.drawLine(0,-this.getHeight()/2,0,this.getHeight()/2);
        g2.drawOval(-20,-20,40,40);
        g2.setColor(Color.RED);



        Ellipse2D.Double ellipse2D = new Ellipse2D.Double(-50,-50,100,100);
        g2.draw(ellipse2D);
        GeneralPath polyline;
        g2.setColor(Color.RED);
         for(int i=0; i < triangles.size();i++ ){

        polyline = new GeneralPath(GeneralPath.WIND_EVEN_ODD,Triangle.COUNT_OF_VERTEX);
        polyline.moveTo(triangles.get(i).getA().getX(),
                triangles.get(i).getA().getY());

        polyline.lineTo(triangles.get(i).getB().getX(),
                        triangles.get(i).getB().getY());

        polyline.lineTo(triangles.get(i).getC().getX(),
                triangles.get(i).getC().getY());


        polyline.closePath();
        g2.draw(polyline);

        }
      }

  }




