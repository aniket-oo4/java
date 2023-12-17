import javax.swing.JFrame;

public class index {
    JFrame frame = new JFrame();

    index() {
        frame.setTitle("CITY GUIDE ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,430);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
new index();
    }
}