import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PercentageCalculator extends JFrame {
    private JTextField nameField, rollNoField, mathsField, scienceField, gkField, englishField;
    private JButton calculateButton, cancelButton;
    private JLabel resultLabel;

    public PercentageCalculator() {
        setTitle("Percentage Application");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 2, 5, 5));

        // Create and add components
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Roll No:"));
        rollNoField = new JTextField();
        add(rollNoField);

        add(new JLabel("Maths:"));
        mathsField = new JTextField();
        add(mathsField);

        add(new JLabel("Science:"));
        scienceField = new JTextField();
        add(scienceField);

        add(new JLabel("GK:"));
        gkField = new JTextField();
        add(gkField);

        add(new JLabel("English:"));
        englishField = new JTextField();
        add(englishField);

        calculateButton = new JButton("Calculate Percentage");
        add(calculateButton);

        cancelButton = new JButton("Clear");
        add(cancelButton);

        add(new JLabel("Result:"));
        resultLabel = new JLabel("");
        add(resultLabel);

        // Add action listeners
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculatePercentage();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private void calculatePercentage() {
        try {
            double maths = Double.parseDouble(mathsField.getText());
            double science = Double.parseDouble(scienceField.getText());
            double gk = Double.parseDouble(gkField.getText());
            double english = Double.parseDouble(englishField.getText());

            double totalMarks = maths + science + gk + english;
            double percentage = (totalMarks / 400) * 100;

            resultLabel.setText(String.format("%.2f%%", percentage));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid marks for all subjects.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        nameField.setText("");
        rollNoField.setText("");
        mathsField.setText("");
        scienceField.setText("");
        gkField.setText("");
        englishField.setText("");
        resultLabel.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PercentageCalculator().setVisible(true);
            }
        });
    }
}
