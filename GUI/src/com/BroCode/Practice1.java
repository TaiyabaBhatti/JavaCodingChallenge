package com.BroCode;

import javax.swing.*;
import java.awt.*;

public class Practice1 {
    public static void main(String[] args) {

        JFrame frame=new JFrame("GUI with Swings");

// frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Exit the application on but application is running in back
// frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Permits the application from going to close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application on close
       frame.setResizable(false);     //prevents from resizng the application
        frame.setSize(450,450);

       ImageIcon icon=new ImageIcon("D:\\2ND SEMESTER\\IdeaProjects\\GUI\\src\\com\\BroCode\\Frame.png");
       frame.setIconImage(icon.getImage());  //get image and set as icon

       frame.getContentPane().setBackground(new Color(189, 23, 23));
       frame.setLayout(null);

       JLabel l1=new JLabel("I' Yellow!!!!");
       l1.setBounds(50,70,100,30);
       l1.setOpaque(true);        //paint every pixels in it's bounds
       l1.setBackground(new Color(16, 104, 192));
        frame.add(l1);
        frame.setVisible(true);
    }
}
