package com.Oct_2;

import javax.swing.*;
import java.awt.*;

public class program5 {
    public static void main(String[] args) {

        JFrame f1=new JFrame("Cup of Coffee Floww");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        f1.setSize(500,500);

//        JButton btn1=new JButton("A");
//        JButton btn2=new JButton("B");
//        JButton btn3=new JButton("C");
//        JButton btn4=new JButton("D");
//        JButton btn5=new JButton("E");

        JPanel panel=new JPanel();
       panel.setPreferredSize(new Dimension(200,200));
        panel.setLayout(new FlowLayout());

        panel.setOpaque(true);
        panel.setBackground(Color.CYAN);

        panel.add(new JButton("A"));
        panel.add(new JButton("B"));
        panel.add(new JButton("C"));
        panel.add(new JButton("D"));
        panel.add(new JButton("E"));
        panel.add(new JButton("F"));
        panel.add(new JButton("G"));
        panel.add(new JButton("H"));
        panel.add(new JButton("I"));
        panel.add(new JButton("J"));
        panel.add(new JButton("K"));
        panel.add(new JButton("L"));
        panel.add(new JButton("M"));
        panel.add(new JButton("N"));
        panel.add(new JButton("O"));
        panel.add(new JButton("P"));

        f1.add(panel);

        f1.setVisible(true);
    }
}
