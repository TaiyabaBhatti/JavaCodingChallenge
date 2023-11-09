package com.Oct_2;
import javax.swing.*;
import java.awt.*;

public class Programe1 {

    public static void main(String[] args) {



    JFrame frame1=new JFrame("GFG Website");
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
// WindowConstants class used to control windows closing operation
        frame1.setSize(500,500);
        frame1.setLayout(null);
        frame1.setVisible(true);
    frame1.setLayout(new BorderLayout());
    JLabel label1=new JLabel("Left Side");
    JLabel label2=new JLabel("Center");
    JLabel label3=new JLabel("Right Side");

//
//   label1.setBounds(150,100,220,50);
//   label2.setBounds(150,200,220,50);
//   label3.setBounds(150,300,220,50);
        label1.setOpaque(true);
        label2.setOpaque(true);
        label3.setOpaque(true);
        label1.setBackground(Color.red);
        label2.setBackground(Color.pink);
        label3.setBackground(Color.green);


//label1.setPreferredSize(new Dimension(100,100));
//label2.setPreferredSize(new Dimension(100,100));
//label3.setPreferredSize(new Dimension(100,100));



        frame1.add(label1,BorderLayout.EAST);
        frame1.add(label2,BorderLayout.CENTER);
        frame1.add(label3,BorderLayout.WEST);








    }
}
