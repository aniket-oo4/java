package guis;

import db_objects.User;

import javax.swing.*;

public class BankAppDialog extends JDialog {

    private  User user ;
    private  BankAppGui bankAppGui;

    BankAppDialog(BankAppGui bankAppGui, User user){

     setSize(400,400);
     setModal(true);  // set focus to dialog
     setLocationRelativeTo(bankAppGui); // center location
     setDefaultCloseOperation(DISPOSE_ON_CLOSE);  // close
     setResizable(false); // disable miximize button
     setLayout(null);
     this.bankAppGui=bankAppGui;  // reference to current gui to change current balce of the user
     this.user=user;

    }
}
