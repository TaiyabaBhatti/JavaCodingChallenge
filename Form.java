package com.finalExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class Form {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
              MyFrame frame=new MyFrame();

    }
}
class MyFrame extends JFrame implements ActionListener {
    JPanel panel1=new JPanel();JPanel panel2=new JPanel();
    JLabel batch=new JLabel();JLabel rollnumber=new JLabel();JLabel name=new JLabel();JLabel department=new JLabel();JLabel password=new JLabel();
   JLabel paragraph=new JLabel();
    JButton button2=new JButton(); JButton button=new JButton();JComboBox dropdown;

    JPasswordField txtpassword=new JPasswordField();JTextField txtrollnumber=new JTextField();JTextField txtname=new JTextField();JTextField txtdepartment=new JTextField();
    MyStudent student;
    String passwordString;

    ArrayList<MyStudent> studentList=new ArrayList<MyStudent>();
    MyFrame() throws IOException, ClassNotFoundException {

        setSize(300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        addComponents();
        revalidate();
        setVisible(true);
    }
    public void addComponents() {
        panel1.setLayout(new GridLayout(8,1,30,10));
        panel1.setPreferredSize(new Dimension(80,300));
        panel2.setLayout(new GridLayout(8,1,30,10));
        panel2.setPreferredSize(new Dimension(150,300));
//Left
        batch.setText("Batch");
        name.setText("Name:");
        rollnumber.setText("Roll Number:");
        password.setText("Password");
        department.setText("Department:");
        button.setText("Create");
        button2.setText("View");



        panel1.add(batch);
        panel1.add(name);
        panel1.add(rollnumber);
        panel1.add(password);
        panel1.add(department);
        panel1.add(button);
        panel1.add(button2);

//Right

        String[] s1 = { "18SW", "18BBA", "22CE", "23SW", "19CS" };
        txtpassword.setEchoChar('*');
        dropdown=new JComboBox(s1);
        panel2.add(dropdown);
        panel2.add(txtrollnumber);
        panel2.add(txtname);
        panel2.add(txtpassword);
        panel2.add(txtdepartment);

//Action performed
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char[] passwordChars = txtpassword.getPassword(); // Get password as char array

                char echoChar = txtpassword.getEchoChar();
                if (echoChar == '*') {
                    txtpassword.setEchoChar((char) 0); // 0 means no echo character (visible)
                } else {
                    txtpassword.setEchoChar('*'); // Set it back to asterisk
                }

                 passwordString = new String(passwordChars);
            }
        });
         button.addActionListener(this);


//add Panels
        add(panel1,BorderLayout.WEST);
        add(panel2,BorderLayout.EAST);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        studentList.add(student=new MyStudent(txtname.getText().toString(),txtrollnumber.getText().toString(),passwordString,txtdepartment.getText().toString(),dropdown.getSelectedItem().toString()));

        File file=new File("D:\\2ND SEMESTER\\IdeaProjects\\Class Programs\\src\\com\\finalExam\\File.txt");
        ObjectOutputStream filetowrite=null;
        try {
            filetowrite=new ObjectOutputStream(new FileOutputStream(file));
            filetowrite.writeObject(student.toString());
            filetowrite.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        ObjectInputStream readfile= null;
        try {
            readfile = new ObjectInputStream(new FileInputStream(file));
          paragraph.setText(readfile.readObject().toString());
            panel2.add(paragraph);
           // System.out.println(readfile.readObject());
            readfile.close();
        } catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
}
}
class MyStudent implements Serializable {
    private String stu_name;
    private String stu_rollNumber;
    private String stu_department;
    private String stu_batch;
    private String stu_password;
    MyStudent(String stu_name, String stu_rollNumber,String stu_password, String stu_department,String stu_batch) {
        this.stu_name = stu_name;
        this.stu_rollNumber = stu_rollNumber;
        this.stu_department = stu_department;
        this.stu_batch = stu_batch;
        this.stu_password=stu_password;
    }

    public String toString() {
        return stu_rollNumber + "\n" + stu_department + "\n" + stu_name + "\n" +stu_password+"\n"+ stu_batch + "\n";
    }

}
