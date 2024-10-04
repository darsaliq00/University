import java.awt.*;

public class LoginAWT{
    LoginAWT(){
        Frame f = new Frame("Login Page");
        Label l1 = new Label("User Name");
        Label l2 = new Label("Password");

        TextField t1 = new TextField();
        TextField t2 = new TextField();

        Button b1 = new Button("Submit");
        Button b2 = new Button("Cancel");

        l1.setBounds(60, 60, 60, 20);
        l2.setBounds(60, 100, 60, 20);

        t1.setBounds(120, 60, 60, 20);
        t2.setBounds(120, 100, 60, 20);

        b1.setBounds(100, 150, 60, 20);
        b2.setBounds(180, 150, 60, 20);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginAWT();
    }
}