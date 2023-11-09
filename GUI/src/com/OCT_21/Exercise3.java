package com.OCT_21;

import javax.swing.*;
import java.awt.*;
//import java.awt.Canvas;
//import java.awt.Graphics;
//import java.awt.Toolkit;
//import java.awt.Image;
public class Exercise3 {

    public static void main(String[] args) {

        JFrame frame=new JFrame();
        Canvas canvas2=new Canvas();
        frame.add(canvas2);
        frame.setSize(500,500);
        frame.setVisible(true);
        Graphics g=canvas2.getGraphics();
        Toolkit t=Toolkit.getDefaultToolkit();
        Image image= t.getImage("D:\\2ND SEMESTER\\IdeaProjects\\GUI\\src\\bhpic4.jpg");
        g.drawImage(image,20,20,canvas2);
        canvas2.setForeground(Color.CYAN);
      g.drawArc(50,60,100,60,90,120);









    }
}









