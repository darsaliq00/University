import java.awt.*;

public class Main {
    private Frame frame;
    private TextField textField;
    private Choice choice;
    private Checkbox checkbox;
    private Button button;
    private TextArea textArea;

    public Main() {
        frame = new Frame("Main");
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        textField = new TextField(20);
        choice = new Choice();
        choice.add("CSE");
        choice.add("ECE");

        checkbox = new Checkbox("CSE", true);

        button = new Button("PRINT");

        textArea = new TextArea(10, 40);
        List items = new List(5);
        items.add("CSE");
        items.add("ECE");
        items.add("CIV");
        items.add("ME");
        items.add("EE");


        frame.add(textField);
        frame.add(choice);
        frame.add(checkbox);
        frame.add(button);
        frame.add(textArea);
        frame.add(items);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

