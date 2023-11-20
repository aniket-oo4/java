
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

    Button on, clear, addn, subn, muln, divn, end, equal;
    TextField input;
    Panel pan1, pan2;
    int no1, no2, ans;
    char oper;

    public Calculator() {

        pan1 = new Panel();
        pan2 = new Panel();
        addn = new Button("+");
        subn = new Button("-");
        muln = new Button("*");
        divn = new Button("/");
        equal = new Button("=");
        on = new Button("on");
        clear = new Button("clear");
        end = new Button("Exit");
        input = new TextField();
        pan1.add(addn);
        pan1.add(subn);
        pan1.add(muln);
        pan1.add(divn);
        pan1.add(equal);

        pan2.add(on);
        pan2.add(clear);
        pan2.add(end);

        setLayout(new BorderLayout());
        add(input, "North");
        add(pan1, "Center");
        add(pan2, "South");
        input.setEnabled(false);
        addn.setEnabled(false);
        subn.setEnabled(false);
        muln.setEnabled(false);
        divn.setEnabled(false);

        addn.addActionListener(this);
        muln.addActionListener(this);
        divn.addActionListener(this);
        subn.addActionListener(this);
        equal.addActionListener(this);
        end.addActionListener(this);
        on.addActionListener(this);
        clear.addActionListener(this);

        setTitle("Arithmetic Calculator ");
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String args[]) {
        new ass15().setVisible();

    }

    public void actionPerformed(ActionEvent e) {
        Button btn = (Button)e.getSource();
        if (btn == end) {
            System.exit(0);
        }
        if (btn == addn || btn == subn || btn == muln || btn == divn) {
            no1 = Integer.parseInt(input.getText());
            oper = btn.getLabel().charAt(0);
        }

        if (btn == equal) {
            no2 = Integer.parseInt(input.getText());
            switch (oper) {
                case '+':
                    ans = no1 + no2;
                    break;
                case '-':
                    ans = no1 - no2;
                    break;
                case '/':
                    ans = no1 / no2;
                    break;
                case '*':
                    ans = no1 * no2;
                    break;

            }
            input.setText(Integer.toString(ans));
        }
        if (btn == clear) {
            input.setText("");
            input.requestFocus();
        }
        if (btn == on) {
            input.setEnabled(true);

            addn.setEnabled(true);
            subn.setEnabled(true);
            muln.setEnabled(true);
            divn.setEnabled(true);
        }
    }

}