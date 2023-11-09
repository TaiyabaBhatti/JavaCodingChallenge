import javax.swing.*;
import java.awt.event.*;

//import java.awt.event.*;
public class DesignWindow {
    public static void main(String[] args) {

//    Mywindow window =  new Mywindow("Calculator");
//    window.setDefaultCloseOperation(Mywindow.EXIT_ON_CLOSE);
//    window.setSize(300,300);
//    window.setVisible(true);

        JFrame frame=new JFrame(" Java Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,300);
    frame.setLayout(null);

//           Adding labels and fields

    JLabel l1=new JLabel("Adding two numbers Program!");
    JLabel l2=new JLabel("First Number :");
    JLabel l3=new JLabel("Second Number :");
    JLabel l4=new JLabel();
    JTextField f1=new JTextField();
    JTextField f2=new JTextField();
    JButton b1=new JButton("ADD");

//    Set position
    l1.setBounds(50,10,200,20);
    l2.setBounds(50,60,150,20);
    l3.setBounds(50,100,150,20);
    l4.setBounds(50,170,150,20);
    f1.setBounds(150,60,100,20);
    f2.setBounds(150,100,100,20);
    b1.setBounds(100,150,100,20);
    // Adding to frame
     b1.addActionListener(new handler(f1,f2,l4));
    frame.add(l1);
    frame.add(l2);
    frame.add(f1);
 frame.add(l3);
 frame.add(f2);
frame.add(b1);
frame.add(l4);
   frame.setVisible(true);


    }
}

class handler implements ActionListener {
    JTextField f1,f2;
    JLabel l4;
    public handler(JTextField f1, JTextField f2,JLabel l4) {
    this.f1=f1;
    this.f2=f2;
    this.l4=l4;
    }

    public void actionPerformed(ActionEvent obj){
    int a=Integer.parseInt(f1.getText());
    int b=Integer.parseInt(f2.getText());
    int sum=a+b;
    l4.setText("Sum is: "+sum);


    }
}
