package com.Oct_17;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Practice1 {

    public static void main(String[] args) {

        Myframe frame=new Myframe();

    }
}

class Myframe extends JFrame{

    JLabel l1=new JLabel();JLabel l2=new JLabel();JLabel l3=new JLabel();
    Myframe(){
     setFrame();
      addLabel();
    }
    public void setFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500,500);
        setTitle("Practice one");
        setVisible(true);
    }
    public void addLabel(){
        l1.setText("Label one");
        l1.setBounds(80,50,100,100);
        l1.setOpaque(true);
        l1.setLayout(new FlowLayout(FlowLayout.CENTER));
        l1.setForeground(Color.blue);
        l1.setBackground(Color.CYAN);
        add(l1);


    }
}