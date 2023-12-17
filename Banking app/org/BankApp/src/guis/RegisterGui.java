package guis;

import db_objects.MyJdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterGui extends BaseFrame {

public RegisterGui(){

    super("My Bank Register");
}
    @Override
    protected void addGuiComponents() {
        // heading
        JLabel bankAppLabel =new JLabel("Banking application Register  ");
        bankAppLabel.setBounds(0,0,super.getWidth(),40);
        bankAppLabel.setFont(new Font("Dialog",Font.BOLD,23));
        bankAppLabel.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        add(bankAppLabel);

        // username input label
        JLabel usernameLabel=new JLabel("Username :");
        usernameLabel.setBounds(20,80,super.getWidth()-30,24);
        usernameLabel.setFont(new Font("Dialog",Font.PLAIN,20));
        add(usernameLabel);

        //usename input field textField
        JTextField  usernameField= new JTextField ();
        usernameField.setBounds(20,120,super.getWidth()-50,30);
        usernameField.setFont(new Font("Dialog",Font.PLAIN,20));
        add(usernameField);


        // password LAbel
        JLabel passwordLabel=new JLabel("Password :");
        passwordLabel.setBounds(20,180,super.getWidth()-50,24);
        passwordLabel.setFont(new Font("Dialog",Font.PLAIN,20));
        add(passwordLabel);

        //pasword  input field JPasswordField()
        JPasswordField  passwordField= new JPasswordField();
        passwordField.setBounds(20, 220, super.getWidth() - 50, 30);
        passwordField.setFont(new Font("Dialog", Font.BOLD, 20));
        add(passwordField);

        // re- Enter pass word
        // password LAbel
        JLabel re_passwordLabel=new JLabel("Re-enter Password :");
        re_passwordLabel.setBounds(20,280,super.getWidth()-50,24);
        re_passwordLabel.setFont(new Font("Dialog",Font.PLAIN,20));
        add(re_passwordLabel);

        //pasword  input field JPasswordField()
        JPasswordField  re_passwordField= new JPasswordField();
        re_passwordField.setBounds(20, 320, super.getWidth() - 50, 30);
        re_passwordField.setFont(new Font("Dialog", Font.BOLD, 20));
        add(re_passwordField);

        // Register button
        JButton registerButton =new JButton("Register");
        registerButton.setBounds(130, 370, 150, 40);
        registerButton.setFont(new Font("Dialog", Font.BOLD, 20));
        registerButton.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username,password;
                //get username
                username=usernameField.getText();

                // get password
                password=String.valueOf(passwordField.getPassword());
                // get  re entered password
                String re_password=String.valueOf(re_passwordField.getPassword());

                // validate user input
                if(validateUserInput(username,password,re_password)){
                    // information true
                    if(MyJdbc.RegisterUser(username,password)) {  // RegisterUser function returns true if username is not exist and user registered successfully
                        // restration successfull
                        RegisterGui.this.dispose();
                        LoginGui loginGui = new LoginGui();
                        loginGui.setVisible(true);
                        JOptionPane.showMessageDialog(loginGui, "Registered Account   SuccessFully  \uD83D\uDE01\uD83D\uDE01\uD83D\uDE01, Login Here ");
                    }
                    else {

                        JOptionPane.showMessageDialog(RegisterGui.this,"ERROR : User name Already Exist 😑😑");
                    }
                }
//                else{
//                    JOptionPane.showMessageDialog(RegisterGui.this,"");
//                }



            }
        });
        add(registerButton);


        // already have acount label  Label
        JLabel LoginLabel= new JLabel("<html><a href=\"#\"> Already  have an Account Login here</a></html>");
        LoginLabel.setBounds(0, 440, super.getWidth() - 10, 30);
        LoginLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
        LoginLabel.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space.setHorizontalAlignment(SwingConstants.CENTER);//  for center alignment both side equal space


        // onclick event for opening login window
        LoginLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                RegisterGui.this.dispose();
                new LoginGui().setVisible(true);

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Cursor cursor = LoginLabel.getCursor();
                LoginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        add(LoginLabel);


    }
    private boolean validateUserInput(String username,String password,String re_password ){
      if(username.length()==0||password.length()==0||re_password.length()==0){
          JOptionPane.showMessageDialog(RegisterGui.this,"Empty Field does not recorded   ");
          return false ;
      }
      if(username.length()<6){
          JOptionPane.showMessageDialog(RegisterGui.this,"username must be 6 characters long  ");
          return false;
      }
      // password and repassword must be same
        if(!password.equals(re_password))
        {
            JOptionPane.showMessageDialog(RegisterGui.this,"passwords are not matching  ");
            return false;
        }

//        password passed
  return true ;
    }
}
