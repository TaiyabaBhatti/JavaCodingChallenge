package com.Oct_2;
import javax.swing.*;
import java.awt.*;

public class Program2 {
    public static void main(String[] args) {

        JFrame f1=new JFrame("Java Cup Coffee");
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new BorderLayout(10,40));
        f1.setSize(500,500);

        JLabel l1=new JLabel("Label 1");
        JLabel l2=new JLabel("Label 2");
        JLabel l3=new JLabel("Label 3");

        l1.setBounds(50,50,100,30);
        l2.setBounds(50,100,100,30);
        l3.setBounds(50,150,100,30);

        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);

        l1.setBackground(Color.blue);
        l2.setBackground(Color.green);
        l3.setBackground(Color.pink);

        l1.setPreferredSize(new Dimension(100,100));
        l3.setPreferredSize(new Dimension(100,100));
        l2.setPreferredSize(new Dimension(100,100));

        f1.add(l1,BorderLayout.WEST);
        f1.add(l2,BorderLayout.NORTH);
        f1.add(l3,BorderLayout.EAST);

    }
}
