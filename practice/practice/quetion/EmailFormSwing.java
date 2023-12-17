import javax.swing.*;
import java.awt.event.*;



public class EmailFormSwing  implements ActionListener {


    JFrame frame;
    JLabel name,surname,mobile,age,username,country;
    JTextField namet ,surnamet,aget,usernamet,coutryt;
    EmailFormSwing()
    {
        frame=new JFrame();
        frame.setSize(400, 500);
        name=new JLabel("Enter YOur Firs name :");
        name.setBounds(40,50,100,30);
        frame.add(name);
        frame.setLayout(null);
        namet=new JTextField();
        namet.setBounds(150,50,100,30);
        frame.add(namet);
        surname=new JLabel("Enter YOur surname");
        surname.setBounds(40,70,100,30);
        frame.add(surname);
        frame.setLayout(null);
        surnamet=new JTextField();
        surnamet.setBounds(150,70,100,30);
        frame.add(surnamet);
        
        JButton submit=new JButton("Submit");
        submit.setBounds(150,400,40,20);
        frame.add(submit);
        submit.addActionListener(this);

       frame.setVisible(true);
    }
  public  void actionPerformed(ActionEvent e)
        {
         if(e.getSource()=="submit"){
            JLabel n=new JLabel("Hello " );
            n.setBounds(200,200, 50,10);
            frame.add(n);
         }

        }

    public static void main(String Args[])
    {


        new EmailFormSwing();
    }
}
