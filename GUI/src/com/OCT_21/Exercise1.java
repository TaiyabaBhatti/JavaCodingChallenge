package com.OCT_21;

import javax.swing.*;
import java.awt.*;

public class Exercise1 {
    public static void main(String[] args) {

        MyCanvas canvas=new MyCanvas();
        JFrame frame=new JFrame("Canvas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.add(canvas);
        frame.setVisible(true);


    }
}
class MyCanvas extends Canvas{

  public void paint(Graphics g){
      setBackground(Color.WHITE);
      setForeground(Color.BLUE);
      g.drawString("Hello",40,40);
      g.drawRect(40,300,100,50);
      g.fillRect(100,40,100,50);
      g.drawArc(200,40,100,50,30,120);
      g.drawLine(300,40,540,40);
      g.drawOval(40,100,100,50);
      g.fillOval(150,100,100,50);

      //PolyGon

      int points=5;
      int[] xPoints={30,100,30,100,30};
      int[] yPoints={480,480,600,600,480};
          g.drawPolygon(xPoints,yPoints,points);

  }
}