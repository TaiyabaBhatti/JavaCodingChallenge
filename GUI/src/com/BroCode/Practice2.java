package com.BroCode;

import javax.swing.*;
import java.awt.*;

public class Practice2 {
    public static void main(String[] args) {
        ImageIcon icon=new ImageIcon("D:\\2ND SEMESTER\\IdeaProjects\\GUI\\src\\com\\BroCode\\Frame.png");
        JFrame frame=new JFrame("Application");
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.getContentPane().setBackground(new Color(36, 187, 124));

//

        JLabel l1=new JLabel();
        l1.setText("ABCDEFGHI");
        l1.setOpaque(true);
        l1.setBounds(50,50,200,30);
//        l1.setBackground(new Color(14, 13, 11));
        l1.setForeground(new Color(239, 66, 8));
        l1.setFont(new Font("MV Boli",Font.ITALIC,30));
//       l1.setIcon(icon);
//       l1.setVerticalTextPosition(JLabel.BOTTOM);
          frame.add(l1);

}
}



