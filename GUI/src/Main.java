import javax.swing.*;
public class Main{
    public static void main(String[] args) {

//        JFrame frame=new JFrame(" My First GUI");
//        frame.setSize(200,300);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JButton button1=new JButton(" Press");
//        JButton button2=new JButton(" Submit");
//        frame.getContentPane().add(button1);
//        frame.getContentPane().add(button2);
//        frame.setVisible(true);

        MyFrame frame=new MyFrame("My First GUI ");
        frame.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);



    }
}
// our own class which extends JFrame class
class MyFrame extends JFrame{

  MyFrame(String title){
      super(title);
  }
}