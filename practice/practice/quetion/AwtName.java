import java.awt.*;
import java.awt.event.*;

import javax.swing.Action;

public class AwtName implements ActionListener {
    Frame frame;
    TextField name, roll;

    AwtName() {
        frame.setLayout(null);
        frame.setSize(600, 700);
        frame = new Frame("my frame");
        Label l = new Label("Enter Name of student ");
        l.setBounds(30, 40, 100, 40);
        frame.add(l);

        name = new TextField();
        frame.add(name);
        name.setBounds(100, 40, 100, 40);
        Label l2 = new Label("Enter roll num of student ");
        l2.setBounds(30, 100, 100, 40);
        frame.add(l2);

        roll = new TextField();
        roll.setBounds(150, 600, 100, 40);
        frame.add(roll);

        frame.setVisible(true);

        Button btn = new Button("btn");
        btn.setBounds(300, 40, 100, 40);
        btn.addActionListener(this);
        frame.add(btn);
    }
    // void display()
    // {

    // Frame obj=new Frame("Details");
    // obj.setVisible(true);
    // String str1=name.getText();
    // Label n= new Label(str1);
    // obj.add(n);
    // }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == "btn") {
            // display();
        }

    }

    public static void main(String args[]) {

        new AwtName();
    }
}
