package com.OCT_21;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Exercise2 {
    public static void main(String[] args) {

        canvas frame_canvas=new canvas();

    }
}
class canvas extends JFrame implements MouseListener, MouseMotionListener {
  private Canvas definedCanvas;
   canvas(){
       super("Canvas");
       definedCanvas=new Canvas();
       definedCanvas.setBackground(Color.BLACK);
       definedCanvas.addMouseListener(this);
       definedCanvas.addMouseMotionListener(this);
       add(definedCanvas);
       setSize(600,600);
       setVisible(true);
   }


    @Override
    public void mouseClicked(MouseEvent e) {
            Graphics g=definedCanvas.getGraphics();
            g.setColor(Color.RED);
            int x,y;
            x=e.getX();
            y=e.getY();
            g.fillOval(x,y,50,50);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g=definedCanvas.getGraphics();
        g.setColor(Color.RED);
        int x,y;
        x=e.getX();
        y=e.getY();
        g.fillOval(x,y,50,50);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        Graphics g=definedCanvas.getGraphics();
        g.setColor(Color.RED);
        int x,y;
        x=e.getX();
        y=e.getY();
        g.fillOval(x,y,50,50);


    }
}