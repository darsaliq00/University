import java.awt.*;
import java.awt.event.*;

public class ClickableButton extends Frame implements ActionListener {
    Button b;

    ClickableButton() {
        b = new Button("Click Me");
        b.setBounds(50, 100, 80, 30);
        b.addActionListener(this);
        add(b);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }

    public static void main(String[] args) {
        new ClickableButton();
    }
}

