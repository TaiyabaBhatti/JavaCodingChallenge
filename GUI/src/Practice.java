import javax.swing.*;
import java.awt.event.*;

public class Practice {
    public static void main(String[] args) {

        MyWindow frame=new MyWindow("GUI using swings");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(MyWindow.EXIT_ON_CLOSE);
        frame.addComponents();
        frame.setVisible(true);



    }
}
class MyWindow extends JFrame implements ActionListener {
    int count;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JButton b1, b2;

    MyWindow(String title) {
        super(title);
    }

    public void addComponents() {

        l1 = new JLabel("Multiplication Of Two Numbers ***");
        l2 = new JLabel("First Number: ");
        l3 = new JLabel("Second Number: ");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Subtract");
        b2 = new JButton("Addition");
        setLayout(null);

        l1.setBounds(20, 10, 200, 20);
        l2.setBounds(30, 40, 100, 20);
        t1.setBounds(130, 40, 100, 20);
        l3.setBounds(30, 60, 100, 20);
        t2.setBounds(130, 60, 100, 20);
        b1.setBounds(160, 90, 100, 20);
        b2.setBounds(50, 90, 100, 20);
        l4.setBounds(90, 130, 100, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(b2);
        add(l4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if (e.getSource() == b1) {
            int sum = a - b;
            l4.setText("Subtraction: " + sum);

        } else if (e.getSource() == b2) {

            int sum = a + b;
            l4.setText("Addition: " + sum);

        }
    }
}




