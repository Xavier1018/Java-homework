package awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DSGCalculator extends JFrame implements ActionListener {

    // Components
    private JTextField display; // Displays numbers and results
    private JButton[] numberButtons = new JButton[10]; // Number buttons 0-9
    private JButton addButton, subButton, mulButton, divButton, equalButton, clearButton, dotButton;
    private JLabel titleLabel; // Title label
    private JPanel panel;

    // Calculation variables
    private double num1, num2, result;
    private char operator;

    public DSGCalculator() {
        // Window setup
        this.setTitle("DSG Calculator");
        this.setSize(400, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display area (JTextField)
        display = new JTextField("0");
        display.setBounds(50, 30, 280, 50);
        display.setFont(new Font("Arial", Font.BOLD, 30));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setBackground(new Color(255, 182, 193)); // Pink background
        display.setEditable(false);
        this.add(display);

        // Title label
        titleLabel = new JLabel("DSG Calculator");
        titleLabel.setBounds(270, 80, 200, 30);
        titleLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        this.add(titleLabel);

        // Initialize buttons
        addButton = createButton("+", 240, 130);
        subButton = createButton("-", 240, 180);
        mulButton = createButton("X", 240, 230);
        divButton = createButton("/", 240, 280);
        equalButton = createButton("=", 300, 180);
        clearButton = createButton("Clear", 300, 230, Color.RED);
        dotButton = createButton(".", 130, 330);

        // Number buttons 0-9
        int x = 50, y = 130;
        for (int i = 1; i <= 9; i++) {
            numberButtons[i] = createButton(String.valueOf(i), x, y);
            x += 60;
            if (i % 3 == 0) { x = 50; y += 50; }
        }
        numberButtons[0] = createButton("0", 50, 330);

        // Add buttons to the window
        this.add(addButton);
        this.add(subButton);
        this.add(mulButton);
        this.add(divButton);
        this.add(equalButton);
        this.add(clearButton);
        this.add(dotButton);
        for (JButton btn : numberButtons) {
            this.add(btn);
        }

        // Add action listeners
        for (JButton btn : numberButtons) btn.addActionListener(this);
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equalButton.addActionListener(this);
        clearButton.addActionListener(this);
        dotButton.addActionListener(this);

        this.setVisible(true);
    }

    private JButton createButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 50, 40);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        return button;
    }

    private JButton createButton(String text, int x, int y, Color color) {
        JButton button = createButton(text, x, y);
        button.setForeground(color); // Set text color
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                if (display.getText().equals("0")) display.setText(String.valueOf(i));
                else display.setText(display.getText() + i);
            }
        }

        if (e.getSource() == dotButton && !display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }

        if (e.getSource() == clearButton) {
            display.setText("0");
            num1 = num2 = result = 0;
        }

        if (e.getSource() == addButton || e.getSource() == subButton || e.getSource() == mulButton || e.getSource() == divButton) {
            num1 = Double.parseDouble(display.getText());
            operator = e.getActionCommand().charAt(0); // Get the symbol from the button
            display.setText("");
        }

        if (e.getSource() == equalButton) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case 'X': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            display.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new DSGCalculator();
    }
}
