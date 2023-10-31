import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator extends JFrame implements ActionListener {
    private JTextField dayField, monthField, yearField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public AgeCalculator() {
        setTitle("Age Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

         JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel dayLabel = new JLabel("Day:");
        dayLabel.setBounds(20, 20, 50, 30);
        panel.add(dayLabel);

        dayField = new JTextField();
        dayField.setBounds(80, 20, 50, 30);
        panel.add(dayField);

        JLabel monthLabel = new JLabel("Month:");
        monthLabel.setBounds(140, 20, 60, 30);
        panel.add(monthLabel);

        monthField = new JTextField();
        monthField.setBounds(200, 20, 50, 30);
        panel.add(monthField);

        JLabel yearLabel = new JLabel("Year:");
        yearLabel.setBounds(20, 60, 50, 30);
        panel.add(yearLabel);

        yearField = new JTextField();
        yearField.setBounds(80, 60, 50, 30);
        panel.add(yearField);

        calculateButton = new JButton("Calculate Age");
        calculateButton.setBounds(140, 60, 140, 30);
        calculateButton.addActionListener(this);
        panel.add(calculateButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(20, 100, 260, 30);
        panel.add(resultLabel);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                int day = Integer.parseInt(dayField.getText());
                int month = Integer.parseInt(monthField.getText()) - 1; // Month is 0-based in Calendar
                int year = Integer.parseInt(yearField.getText());

                Calendar birthdate = Calendar.getInstance();
                birthdate.set(year, month, day);

                Calendar today = Calendar.getInstance();
                int age = today.get(Calendar.YEAR) - birthdate.get(Calendar.YEAR);

                if (today.get(Calendar.DAY_OF_YEAR) < birthdate.get(Calendar.DAY_OF_YEAR)) {
                    age--;
                }
                if(month>12)
                    resultLabel.setText("please enter valid month ::");
                else if(day>31||day<=0)
                    resultLabel.setText("please enter valid day ::");
                else if(today.get(Calendar.YEAR)<=birthdate.get(Calendar.YEAR))
                {
                    resultLabel.setText("please enter valid  year ");
                }
                else
                {  
                     JLabel monthLabel= new JLabel("hello");  
                     panel.add(monthLabel); 
                    //  this.monthLabel= new JLabel("ha ha ah");          
                resultLabel.setText("Your current age is: "+age+" dont know who are you " + age + " years.");
                }          
  } catch (Exception ex) {
                resultLabel.setText("Invalid input. Please enter numbers for day, month, and year.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AgeCalculator calculator = new AgeCalculator();
            calculator.setVisible(true);
        });
    }
}
