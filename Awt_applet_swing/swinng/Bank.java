import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bank extends JFrame implements ActionListener {
    JTextField nameField, accountNumberField;
    JButton submitButton, displayButton;

    public Bank() {
        setTitle("Account Details");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel accountNumberLabel = new JLabel("Account Number:");
        accountNumberField = new JTextField();

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        displayButton = new JButton("Display");
        displayButton.addActionListener(this);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(accountNumberLabel);
        panel.add(accountNumberField);
        panel.add(submitButton);
        panel.add(displayButton);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            
        } else if (e.getSource() == displayButton) {
            // Handle displaying information from the database (step 5)
            // You'll need to implement this part
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Bank().setVisible(true);
        });
    }
}
