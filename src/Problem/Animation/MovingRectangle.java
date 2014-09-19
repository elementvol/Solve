package Problem.Animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: ara
 * Date: 17.09.14
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class MovingRectangle extends JPanel implements ActionListener{

    Timer timer = new Timer(2,this);
   boolean flag = false;
    int x=0, stepX =1;
    int y =0, stepY =5;
    static Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    static int windowWidth = (int)dimension.getWidth()/5;
    static int windowHeight =(int)dimension.getHeight()/5;


    public MovingRectangle() {
      JFrame frame= new JFrame("Frame");
     // JPanel jPanel = new JPanel();
      frame.setVisible(true);
      frame.setSize(windowWidth,windowHeight);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // frame.getContentPane().add(jPanel);
      frame.getContentPane().add(this);
      //this.setBackground(Color.white);
    //  this.setFocusPainted(false);
    //  this.setBorderPainted(false);
     // this.setEnabled(false);


    }

    @Override
    protected void paintComponent(Graphics g) {
       if(flag) {super.paintComponent(g);

            flag=false;}
       // super.paintComponent(g);

       if(stepY<0) g.setColor(Color.BLUE);
       else if(stepY>0) g.setColor(Color.RED);
        g.fillRect(x, y, 20, 20);
        timer.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x > this.getWidth()-20||x<0){ stepX =-stepX;
            if(y>=this.getHeight()-20) stepY =-stepY;
            y=y+ stepY;
        }
        if(y>this.getHeight()-20||y<0){ stepY =-stepY;
            y=y+ stepY;
          flag=true;}
         x=x+ stepX;

        repaint();
    }
    public static void main(String[] args)
    {
     new MovingRectangle();
    }

}

