package com.Oct_2;

import javax.swing.*;
import java.awt.*;

public class Program3 {
    public static void main(String[] args) {

        JFrame f1=new JFrame("HAve a Coffee");
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.setSize(500,500);

        JButton btn1=new JButton("North");
        JButton btn2=new JButton("West");
        JButton btn3=new JButton("South");
        JButton btn4=new JButton("East");
        JButton btn5=new JButton("Center");

        btn1.setBounds(10,10,460,50);
        btn2.setBounds(10,70,70,319);
        btn3.setBounds(10,400,460,50);
        btn4.setBounds(400,70,70,319);
        btn5.setBounds(90,70,300,319);

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

        f1.add(btn1);
        f1.add(btn2);
        f1.add(btn3);
        f1.add(btn4);
        f1.add(btn5);








    }
}
