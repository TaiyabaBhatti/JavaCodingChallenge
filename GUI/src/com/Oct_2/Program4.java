package com.Oct_2;

import javax.swing.*;
import java.awt.*;

public class Program4 {
    public static void main(String[] args) {
        JFrame f1=new JFrame("Cup of Coffee");
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new BorderLayout(20,10));
        f1.setSize(500,500);

        JButton btn1=new JButton("North");
        JButton btn2=new JButton("West");
        JButton btn3=new JButton("South");
        JButton btn4=new JButton("East");
        JButton btn5=new JButton("Center");

        btn1.setPreferredSize(new Dimension(100,50));
        btn2.setPreferredSize(new Dimension(100,50));
        btn3.setPreferredSize(new Dimension(80,100));
        btn4.setPreferredSize(new Dimension(80,100));
        btn5.setPreferredSize(new Dimension(100,100));

        btn1.setOpaque(true);
        btn2.setOpaque(true);
        btn3.setOpaque(true);
        btn4.setOpaque(true);
        btn5.setOpaque(true);

        btn1.setBackground(Color.pink);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.yellow);
        btn4.setBackground(Color.blue);
        btn5.setBackground(Color.red);

        f1.add(btn1,BorderLayout.NORTH);
        f1.add(btn2,BorderLayout.SOUTH);
        f1.add(btn3,BorderLayout.WEST);
        f1.add(btn4,BorderLayout.EAST);
        f1.add(btn5,BorderLayout.CENTER);


    }
}
