import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color.*;

public class Main implements ActionListener {
    private JFrame mainFrame;
    private JTextField inputField;
    private JLabel balanceLabel;
    private int balance = 0;

    public Main() {
        //METHOD-2 : Using Color Constructors
        mainFrame = new JFrame("Simple Bank Application");
        mainFrame.setVisible(true);
        mainFrame.setSize(400, 400);
        mainFrame.setFont(new Font("Arial",Font.BOLD,18));
        mainFrame.setLayout(new FlowLayout());

        inputField = new JTextField(10);
        balanceLabel = new JLabel("Current balance: " + balance);
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");

        mainFrame.add(inputField);
        mainFrame.add(depositButton);
        mainFrame.add(withdrawButton);
        mainFrame.add(balanceLabel);

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int amount = Integer.parseInt(inputField.getText());
        if (e.getActionCommand().equals("Deposit")) {
            balance += amount;
        } else {
            balance -= amount;
        }
        balanceLabel.setText("Current balance: " + balance);
        inputField.setText("");
    }

    public static void main(String[] args) {
        new Main();
    }
}