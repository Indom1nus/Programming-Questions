package NewwDpllar;

import java.awt.*;
import java.*;
import javax.swing.*;
import java.awt.event.*;

public class NewDollar extends JPanel implements MouseListener
{
    int x;
    int tr;
    int x2;
    int y;
    int y2;
    boolean start = false;
    int a;
    int b;
    int col1;
    int col2;
    int z = 0;
    int col3;
    String r;
    public RandomCircle()
    {
        addMouseListener(this);
    }

    public void paint(Graphics g)
    {
        col1  = (int) ((255) * Math.random());
        col2  = (int) ((255) * Math.random());
        col3  = (int) ((255) * Math.random());
        tr = (int) ((255) * Math.random());
        g.setColor(new Color(col1,col2,col3,tr));  
        if (start == true)
        {
            a  = (int) ((102) * Math.random() + 99);
            x -= a/2;
            y -= a/2; 
            z = (int) a/2;
            g.fillOval(x,y, a, a);
            
            g.setColor(new Color(0,0,0));
            g.drawOval(x,y,a,a);
            
            r = Integer.toString(z);
            g.setFont(new Font("Arial", Font.PLAIN,z));
            g.drawString(r,x2-(a/3)+5,y2+(a/4)-13);   
        }                         
    }

    public void mousePressed(MouseEvent e)
    {
        start = true;

        x = e.getX();
        x2 = e.getX();
        y = e.getY();
        y2 = e.getY();
        repaint();

    }

    public void mouseClicked(MouseEvent e)
    {
    }

    public void mouseExited(MouseEvent e)
    {
    }

    public void mouseReleased(MouseEvent e)
    {
    }

    public void mouseEntered(MouseEvent e)
    {
    }
}


