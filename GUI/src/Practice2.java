import javax.swing.*;

public class Practice2 {
    public static void main(String[] args) {

        Form form=new Form("Form submission");
       form.addComponents();




    }
}

class Form extends JFrame{

    JLabel l1,l2,l3,l4;
    JRadioButton r1,r2,r3;

    JCheckBox c1,c2,c3;
    Form(String title){
        super(title);
        setSize(300,300);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
//        form.addComponents();
        setVisible(true);
    }

    public void addComponents(){
        l1=new JLabel("Select your Gender:");
        r1=new JRadioButton("Female");
        r2=new JRadioButton("Male");
        r3=new JRadioButton("Neutal");
        c1=new JCheckBox("Web DEveloper");
        c2=new JCheckBox("Flutter Developer");
        c3=new JCheckBox("UI/UX Designer");
        setLayout(null);
        l1.setBounds(20,20,200,30);
        r1.setBounds(20,50,200,30);
        r2.setBounds(20,80,200,30);
        r3.setBounds(20,110,200,30);
        c1.setBounds(20,150,200,30);
        c2.setBounds(20,180,200,30);
        c3.setBounds(20,210,200,30);
        ButtonGroup button=new ButtonGroup();
        button.add(r1);
        button.add(r2);
        button.add(r3);
        add(l1);
        add(r1);
        add(r2);
        add(r3);
        add(c1);
        add(c2);
        add(c3);

    }

}
