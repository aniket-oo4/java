import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A1 {

    A1() {

        Frame frame = new Frame("My first program ");
        frame.setLayout(null);
        frame.setBackground(Color.GRAY);
        frame.setSize(500,500);
        // frame.setBounds(500, 500, 500, 500);
        frame.setVisible(true);

        Label lbl1 = new Label("Hello how are you ");
        lbl1.setBounds(200, 100, 130, 50);
        frame.add(lbl1);
        
        
        Button btn1 = new Button("CLick me");
        btn1.setBounds(100, 100, 80, 40);
        btn1.setBackground(Color.YELLOW);
        btn1.setForeground(Color.red);
        frame.add(btn1);
        
        TextField txt1 = new TextField("enter numbers");
        txt1.setBounds(200, 200, 100, 30);
        frame.add(txt1);

        Checkbox chk = new Checkbox("male", null, true);
        chk.setBounds(300, 200, 100, 100);
        frame.add(chk);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                frame.dispose();
            }
        });

    }

    public static void main(String args[]) {
        new A1();
    }

}
