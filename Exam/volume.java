import java.awt.event.*;
import javax.swing.*;
class A implements ActionListener 
{
    JFrame f;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3,l4;
    JButton b;
    A()
    {
        f=new JFrame("Volume calculator");
        f.setSize(300,300);
        f.setLayout(null);
        l1=new JLabel("Length:");
        l1.setBounds(30,40,80,20);
        t1=new JTextField();
        t1.setBounds(120,40,80,20);
        l2=new JLabel("Breadth:");
        l2.setBounds(30,60,80,20);
        t2=new JTextField();
        t2.setBounds(120,60,80,20);
        l3=new JLabel("width:");
        l3.setBounds(30,90,80,20);
        t3=new JTextField();
        t3.setBounds(120,90,80,20);
      b=new JButton("click");
      b.setBounds(50,150,80,30);
l4=new JLabel();
l4.setBounds(70,200,80,30);
      f.add(l1);
      f.add(l2);
      f.add(l3);
      f.add(t1);
      f.add(t2);
      f.add(t3);
      f.add(b);
      f.add(l4);
      f.setVisible(true);
      b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s=t1.getText();
        double a=Double.parseDouble(s);


        String p=t2.getText();
        double b=Double.parseDouble(p);

        String q=t3.getText();
        double c=Double.parseDouble(q);

        double res=a*b*c;
  l4.setText(String.format("%.2f",res));
    }
}

public class volume {
    public static void main(String[] args) {
        A a=new A();
    }
}
