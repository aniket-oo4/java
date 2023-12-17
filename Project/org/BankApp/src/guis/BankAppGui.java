package guis;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import db_objects.*;
public class BankAppGui extends BaseFrame implements ActionListener{
    private JTextField currentBalanceField;
    public  JTextField getCurrentBalanceField(){ return currentBalanceField;
    }

    public BankAppGui(User user){
    super("Welcome To Bank",user);
}
    @Override
    protected void addGuiComponents() {
        String name= user.getUsername();
        String welcomemsg="<html>"+"<body style='text-align:center;color:violet;  border-bottom: 6px solid red;' >"+"<b>Welcome "+"  "+name+"</b>"+
                " </body></html>";
//


        JLabel welcomeMsgLabel =new JLabel(welcomemsg);
        welcomeMsgLabel.setBounds(0,20,getWidth(),24);
        welcomeMsgLabel.setFont(new Font("Dialog",Font.BOLD,16));
        welcomeMsgLabel.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        add(welcomeMsgLabel);

//        JLabel headLabel =new JLabel("<html> <body style='text-align:center;color:blue>  '_____________________________________________ </body></html>");
//        headLabel.setBounds(0,50,super.getWidth(),20);
//        headLabel.setFont(new Font("Dialog",Font.PLAIN,18));
//        headLabel.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
//        add(headLabel);

        // current balance ::

        JLabel currentBalancelabel =new JLabel("Current Balance ");

        currentBalancelabel.setBounds(0,74,super.getWidth(),15);
        currentBalancelabel.setFont(new Font("Dialog",Font.PLAIN,18));
        currentBalancelabel.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        add(currentBalancelabel);

        currentBalanceField =new JTextField("₹"+user.getCurrentBalance());
        currentBalanceField.setBounds(130,95,150,30);
        currentBalanceField.setFont(new Font("Dialog",Font.BOLD,20));
        currentBalanceField.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        add(currentBalanceField);
        currentBalanceField.setEditable(false);///  to set user not able to edit this field

        // deposit button
        JButton depositButton =new JButton("Deposit");
        depositButton.setBounds(20, 140, super.getWidth() - 50, 40);
        depositButton.setFont(new Font("Dialog", Font.BOLD, 20));
        depositButton.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        depositButton.addActionListener(this);
        add(depositButton);

        // withdraw button
        JButton withdrawButton =new JButton("withdraw");
        withdrawButton.setBounds(20, 200, super.getWidth() - 50, 40);
        withdrawButton.setFont(new Font("Dialog", Font.BOLD, 20));
        withdrawButton.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        withdrawButton.addActionListener(this);
        add(withdrawButton);

        // pastTransactionButton
        JButton pastTransactionButton =new JButton("past Transactions");
        pastTransactionButton.setBounds(20, 260, super.getWidth() - 50, 40);
        pastTransactionButton.setFont(new Font("Dialog", Font.BOLD, 20));
        pastTransactionButton.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        pastTransactionButton.addActionListener(this);
        add(pastTransactionButton);

        // transferButton
        JButton transferButton =new JButton("Transfer");
        transferButton.setBounds(20, 320, super.getWidth() - 50, 40);
        transferButton.setFont(new Font("Dialog", Font.BOLD, 20));
        transferButton.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        transferButton.addActionListener(this);
        add(transferButton);

        // LogoutButton
        JButton logoutButton =new JButton("Logout");
        logoutButton.setBounds(130, 400, 150, 40);
        logoutButton.setFont(new Font("Dialog", Font.BOLD, 20));
//        logoutButton.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space

       //adding action listener to logout
       logoutButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               // disposing current gui
               BankAppGui.this.dispose();
               // creating new login Gui
               LoginGui loginGui=new LoginGui();
               loginGui.setVisible(true);
               // for showing succefully logout message on screen
               JOptionPane.showMessageDialog(loginGui,"Logged Out");  // firstparameter is this class names object where you want to show this text message

           }
       });
        add(logoutButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new BankAppDialog(this,user).setVisible(true);;
    }
}
