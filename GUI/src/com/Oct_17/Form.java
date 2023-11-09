package com.Oct_17;
import javax.swing.*;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Form {
    public static void main(String[] args) {
        MyForm form=new MyForm();
    }
}
class MyForm extends JFrame{
    JLabel heading=new JLabel();
    JLabel firstName=new JLabel();
    JTextField t1=new JTextField();
    JLabel password=new JLabel();
    JPasswordField passwordField=new JPasswordField();
  JTextArea userBio=new JTextArea("Bio:");
   JButton loginButton=new JButton();
   JLabel outputInfo=new JLabel();

   JLabel genderLabel=new JLabel();
   ButtonGroup groupRadioButtons=new ButtonGroup();
   JRadioButton male=new JRadioButton();
   JRadioButton female=new JRadioButton();
   JRadioButton neutral=new JRadioButton();
MyForm(){

    setForm();
    addlabelsAndTextFields();
    addTextArea();
    addLoginButton();
    addOutputInfo();
    addRadioButtons();
}

       public void setForm(){
        ImageIcon image=new ImageIcon("D:\\2ND SEMESTER\\IdeaProjects\\GUI\\src\\com\\Oct_17\\Vegetables.jpg");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000,700);
        getContentPane().setBackground(Color.BLACK);
        setTitle("Sign Up form");
        setIconImage(image.getImage());
        setVisible(true);;
    }
       public void addlabelsAndTextFields() {
        heading.setText("Login Page");
        heading.setFont(new Font("arial",Font.BOLD,30));
        heading.setBounds(350,50,300,50);
        heading.setOpaque(true);
        heading.setBackground(Color.WHITE);
        heading.setForeground(Color.BLACK);
        //heading.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        add(heading);
        firstName.setText("Enter your Name: ");
        firstName.setBounds(50,150,200,20);
        firstName.setFont(new Font("arial",Font.BOLD,15));
        firstName.setForeground(Color.WHITE);
        add(firstName);
        t1.setBounds(200,150,150,20);
        add(t1);

        password.setText("Enter your Password: ");
        password.setBounds(50,200,210,20);
        password.setFont(new Font("arial",Font.BOLD,15));
        password.setForeground(Color.WHITE);
        add(password);
        passwordField.setBounds(210,200,150,20);
        add(passwordField);
    }
       public void addTextArea(){
     userBio.setBounds(400,150,200,100);
     add(userBio);
}
       public void addLoginButton(){
    loginButton.setText("Login");
    loginButton.setBounds(700,150,100,20);
    loginButton.setOpaque(true);
    loginButton.setBackground(Color.WHITE);
    loginButton.setForeground(Color.BLACK);
    loginButton.addActionListener(new handler(t1,passwordField,outputInfo));
    add(loginButton);
}
       public void addRadioButtons(){

    genderLabel.setText("Gender");
    genderLabel.setBounds(50,300,100,50);
    genderLabel.setFont(new Font("arial",Font.BOLD,15));
   genderLabel.setOpaque(false);
    genderLabel.setForeground(Color.WHITE);
    add(genderLabel);

           //Radio Buttons

    male.setText("male");
    male.setBounds(50,350,150,30);
    female.setText("Female");
    female.setBounds(50,380,150,30);
    neutral.setText("Neutral");
    neutral.setBounds(50,410,150,30);
     add(male);
     add(female);
     add(neutral);
    groupRadioButtons.add(male);
    groupRadioButtons.add(female);
    groupRadioButtons.add(neutral);
     loginButton.addActionListener(new handler2(male,female,neutral,outputInfo));
}








public void addOutputInfo() {

    add(outputInfo);
}
}



class handler implements ActionListener{

     JTextField firstName;
     JPasswordField password;
     JLabel outputInfo;



     handler(JTextField firstName,JPasswordField password,JLabel outputInfo){
        this.firstName=firstName;
        this.password=password;
        this.outputInfo=outputInfo;
    }

    public void actionPerformed(ActionEvent e) {
        String text = firstName.getText();
        String toolTipText = Arrays.toString(password.getPassword());
        String append=text +"\n"+ toolTipText;
        outputInfo.setText(append);
        outputInfo.setBackground(Color.WHITE);
        outputInfo.setBounds(50, 500, 300, 150);
        outputInfo.setOpaque(true);
        outputInfo.setForeground(Color.BLACK);
    }
}


class handler2 implements ActionListener{

     JRadioButton male;
     JRadioButton female;
     JRadioButton neutral;
     JLabel outputInfo;
     handler2(JRadioButton male,JRadioButton female,JRadioButton neutral,JLabel outputInfo){
        this.male=male;
        this.female=female;
        this.neutral=neutral;
        this.outputInfo=outputInfo;
    }
    public void actionPerformed(ActionEvent e) {
        String gender = null;
        if (male.isSelected()){
            gender="Male";
        }
        else if (female.isSelected()){
            gender="Female";
        } else if (neutral.isSelected()){
            gender="Neutral";
        }
        outputInfo.setBackground(Color.CYAN);
        outputInfo.setOpaque(true);
        outputInfo.setBounds(50,200,100,100);
        outputInfo.setForeground(Color.BLACK);
        outputInfo.setText(gender);
    }
}