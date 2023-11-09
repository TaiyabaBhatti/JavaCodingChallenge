package com.finalExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;

public class Form2 {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setLayout(new BorderLayout(10,10));
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelForm=new JPanel(new GridLayout(8,2,20,10));
        JPanel panelResult=new JPanel();
        JPanel panelbutton=new JPanel(new GridLayout(3,2,20,10));
//  Labels
        JLabel l1=new JLabel();
        JLabel l2=new JLabel();
        JLabel l3=new JLabel();
        JLabel l4=new JLabel();
        JLabel l5=new JLabel();
        l1.setText("Batch");
        l2.setText("Name");
        l3.setText("Roll Number");
        l4.setText("Password");
        l5.setText("Department");

 //     Text Area

     JTextArea outputArea=new JTextArea();

// TextFields

        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        JPasswordField t4=new JPasswordField();
        JTextField t5=new JTextField();
        t4.setEchoChar('*');

// Combo Box
        String[] s1 = { "18SW", "18BBA", "22CE", "23SW", "19CS" };
        JComboBox dropdown=new JComboBox(s1);

//Buttons
        JButton button1=new JButton();
        JButton button2=new JButton();
        button1.setText("Create");
        button2.setText("View");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Student student;
                char[] passwordChars = t4.getPassword();
                String passwordString=new String(passwordChars);
                student=new Student(t2.getText().toString(),t3.getText().toString(),passwordString,t5.getText().toString(),dropdown.getSelectedItem().toString());
                File file=new File("D:\\2ND SEMESTER\\IdeaProjects\\Class Programs\\src\\com\\finalExam\\DataFile.txt");
               try{
                   if (file.exists()){
                       file.createNewFile();
                   }
               }
               catch (Exception obj1){
                   System.out.println("Exception: "+obj1.getMessage());
               }

                ObjectOutputStream objectOutputStream;
               try{
                   objectOutputStream=new ObjectOutputStream(new FileOutputStream(file.getPath()));
                       objectOutputStream.writeObject(student.toString());
                       objectOutputStream.close();
               }
               catch (Exception obj2){
                System.out.println("Exception: "+obj2.getMessage());
               }

                ObjectInputStream objectInputStream= null;
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file.getPath()));
                    outputArea.setText(objectInputStream.readObject().toString());
                    objectInputStream.close();
                } catch (IOException | ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }

                panelResult.add(outputArea);
                panelResult.setVisible(true);

               }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                char echoChar = t4.getEchoChar();
//                if (echoChar == '*') {
//                    t4.setEchoChar((char) 0);
//                } else {
//                    t4.setEchoChar('*');
//                }
                panelForm.setVisible(true);
            }
        });

// Add to the frame
        panelForm.add(l1);
        panelForm.add(dropdown);
        panelForm.add(l2);
        panelForm.add(t2);
        panelForm.add(l3);
        panelForm.add(t3);
        panelForm.add(l4);
        panelForm.add(t4);
        panelForm.add(l5);
        panelForm.add(t5);
        panelForm.setVisible(false);
        panelResult.setVisible(false);
        frame.add(panelForm,BorderLayout.WEST);
        frame.add(panelResult,BorderLayout.EAST);
        panelbutton.add(button1);
        panelbutton.add(button2);
        frame.add(panelbutton,BorderLayout.SOUTH);
       frame.revalidate();
        frame.setVisible(true);
    }
}
class Student implements Serializable {

    private String stu_name;
    private String stu_rollNumber;
    private String stu_department;
    private String stu_batch;
    private String stu_password;
    Student(String stu_name, String stu_rollNumber,String stu_password, String stu_department,String stu_batch) {
        this.stu_name = stu_name;
        this.stu_rollNumber = stu_rollNumber;
        this.stu_department = stu_department;
        this.stu_batch = stu_batch;
        this.stu_password=stu_password;
    }
    public String toString() {
        return "Roll Number: "+stu_rollNumber + "\n" + "Department: "+stu_department + "\n"+"UserName: "+ stu_name + "\n"+ "Password: "+stu_password+"\n"+"Batch: "+ stu_batch + "\n";
    }
}