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
    Timer timer = new Timer(5,this);
    int x=0,dx =1;
    int y =0,dy =5;
    public MovingRectangle() {
      JFrame frame= new JFrame("Frame");
      frame.setVisible(true);
      frame.setSize(500,500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x,y,20,20);

        timer.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x > 480||x<0) dx=-dx ;
        if(y>480||y<0) dy=-dy;
         x=x+dx;
        y=y+dy;
        repaint();
    }
    public static void main(String[] args)
    {
     new MovingRectangle();
    }
}

