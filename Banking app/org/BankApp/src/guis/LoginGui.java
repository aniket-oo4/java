package guis;

import db_objects.MyJdbc;
import db_objects.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGui extends BaseFrame{
    public LoginGui(){
        super("My Bank LOGIN");

    }
    @Override
    protected void addGuiComponents() {

        // heading
//        JLabel bankAppLabel =new JLabel("<html><body><style=\" font-family: Arial, Helvetica, sans-serif;color:blue;\">Banking application login   </style></body></html>");
        JLabel bankAppLabel =new JLabel("Banking application login  ");
        bankAppLabel.setBounds(0,20,super.getWidth(),40);
        bankAppLabel.setFont(new Font("Dialog",Font.BOLD,25));
        bankAppLabel.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        add(bankAppLabel);

        // username input label
        JLabel usernameLabel=new JLabel("Username :");
        usernameLabel.setBounds(20,120,super.getWidth()-30,24);
       usernameLabel.setFont(new Font("Dialog",Font.PLAIN,20));
        add(usernameLabel);

        //usename input field textField
        JTextField  usernameField= new JTextField ();
        usernameField.setBounds(20,160,super.getWidth()-50,30);
        usernameField.setFont(new Font("Dialog",Font.PLAIN,20));
        add(usernameField);


        // password LAbel
        JLabel passwordLabel=new JLabel("Password :");
        passwordLabel.setBounds(20,260,super.getWidth()-50,24);
        passwordLabel.setFont(new Font("Dialog",Font.PLAIN,20));
        add(passwordLabel);

        //pasword  input field JPasswordField()
        JPasswordField  passwordField= new JPasswordField();
        passwordField.setBounds(20, 300, super.getWidth() - 50, 30);
        passwordField.setFont(new Font("Dialog", Font.BOLD, 20));
        add(passwordField);

        // login button

        JButton loginButton =new JButton("Login");
        loginButton.setBounds(130, 370, 150, 40);
        loginButton.setFont(new Font("Dialog", Font.BOLD, 20));
        loginButton.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        // action listener to login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=usernameField.getText();  // username from textField
                String password=String.valueOf(passwordField.getPassword()); // passqird from PAsswprd textField in login gUI
                /// validation
                User user= MyJdbc.validateUserLogin(username,password); // return result of myjdbc class validate user p=login function return user object  other wise retun null
             // if valid
              if(user!=null){
                  // this.dispose() method is used to close current Gui  this is a object of currrent class mean LoginGui class
                  LoginGui.this.dispose(); // closing this login gui object ;

                  // opening new Gui by passing values returned by validate USer Login method
                  BankAppGui bankAppGui=new BankAppGui(user);// passsing object returned by Validate login method
                  bankAppGui.setVisible(true);

                  // for showing succefully login message on screen
                  JOptionPane.showMessageDialog(bankAppGui,"Login SuccessFully");

              }
              // if user == null then show msg unsuccessfull login
              else{
                  JOptionPane.showMessageDialog(LoginGui.this,"Login UnsuccessFul");
              }
            }
        });
        add(loginButton);

        // Register Label
        JLabel registerLabel= new JLabel("<html><a href=\"#\"> Don't have an Account Register here</a></html>");
        registerLabel.setBounds(0, 440, super.getWidth() - 10, 30);
        registerLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space

      // listener for when clicked launch register Gui
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginGui.this.dispose();
                new RegisterGui().setVisible(true);
            }

            // cursor change
            public void mouseEntered(MouseEvent e) {
                Cursor cursor = registerLabel.getCursor();
                registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        add(registerLabel);


    }
}
