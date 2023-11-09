package com.OCT_21;

import javax.swing.*;
import java.awt.*;


public class borderLayout {
    public static void main(String[] args) {
MyFrame frame=new MyFrame();
frame.setVisible(true);
    }
}

class MyFrame extends JFrame{
JLabel l1=new JLabel();JLabel l2=new JLabel();JLabel l3=new JLabel();JLabel l4=new JLabel();JLabel l5=new JLabel();
JTextField t1=new JTextField();JTextField t2=new JTextField();JTextField t3=new JTextField();

JLabel text1=new JLabel("UNICORN");JLabel text2=new JLabel("EAGLE");JLabel text3=new JLabel("JFTHUNDER");
JLabel text4=new JLabel("SOFTWARE ENGINEER");JLabel text5=new JLabel("MOUNTAINS");JLabel text6=new JLabel("EGO");
JLabel p1=new JLabel("UNICORN");JLabel p2=new JLabel("EAGLE");JLabel p3=new JLabel("JFTHUNDER");
JLabel p4=new JLabel("SOFTWARE ENGINEER");JLabel p5=new JLabel("MOUNTAINS");JLabel p6=new JLabel("EGO");

    MyFrame(){
        setFrame();
        addLabels();
        addTextFieldCenter();
        addTextFieldSouth();
        setVisible(true);
    }
    public void setFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));
        setSize(700,700);
    }
 public void addLabels(){
        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);
        l4.setOpaque(true);
        l5.setOpaque(true);

        l1.setBackground(Color.WHITE);
        l2.setBackground(Color.ORANGE);
        l3.setBackground(Color.PINK);
        l4.setBackground(Color.GRAY);
        l5.setBackground(Color.cyan);

l1.setPreferredSize(new Dimension(100,50));
l2.setPreferredSize(new Dimension(200,50));
l3.setPreferredSize(new Dimension(100,150));
l4.setPreferredSize(new Dimension(100,150));
l5.setPreferredSize(new Dimension(200,50));
       add(l1, BorderLayout.CENTER);
       add(l2, BorderLayout.WEST);
       add(l3, BorderLayout.NORTH);
       add(l4, BorderLayout.SOUTH);
       add(l5, BorderLayout.EAST);

    }

public void addTextFieldCenter(){
        l1.setLayout(new FlowLayout(FlowLayout.CENTER));

text1.setBounds(20,20,300,50);
text1.setOpaque(true);
text2.setOpaque(true);
text3.setOpaque(true);
text4.setOpaque(true);
text5.setOpaque(true);
text6.setOpaque(true);
text1.setBackground(Color.CYAN);
text2.setBackground(Color.ORANGE);
text3.setBackground(Color.YELLOW);
text4.setBackground(Color.PINK);
text5.setBackground(Color.GRAY);
text6.setBackground(Color.GREEN);
//
//text2.setBounds(20,40,100,50);
//text3.setBounds(20,60,100,50);
//text4.setBounds(20,80,100,50);
//text5.setBounds(20,100,100,50);
//text6.setBounds(20,120,100,50);

    l1.add(text1);
l1.add(text2);
l1.add(text3);
l1.add(text4);
l1.add(text5);
l1.add(text6);
}



public void addTextFieldSouth(){
       l4.setLayout(new GridLayout(3,4,10,10));
    p1.setBounds(20,20,100,30);
    p1.setOpaque(true);
    p2.setOpaque(true);
    p3.setOpaque(true);
    p4.setOpaque(true);
    p5.setOpaque(true);
    p6.setOpaque(true);
    p1.setBackground(Color.CYAN);
    p2.setBackground(Color.ORANGE);
    p3.setBackground(Color.YELLOW);
    p4.setBackground(Color.PINK);
    p5.setBackground(Color.GRAY);
    p6.setBackground(Color.GREEN);

//    p2.setBounds(20,40,100,30);
//    p3.setBounds(20,70,100,30);
//    p4.setBounds(20,100,100,30);
//    p5.setBounds(20,200,100,30);
//    p6.setBounds(20,250,100,30);

   l4.add(p1);
   l4.add(p2);
   l4.add(p3);
   l4.add(p4);
   l4.add(p5);
   l4.add(p6);

}




}
