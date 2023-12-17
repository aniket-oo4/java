import java.io.*;

public class FileLine {

    public static void main(String args[]) throws IOException, FileNotFoundException

    {

        int n, lines = 0, words = 0, chr = 0;
        FileInputStream f = new FileInputStream("in.txt");
        FileOutputStream of = new FileOutputStream("out.txt", false);

        while ((n = f.read()) != -1) {

            System.out.print((char) n);
            if (((char) n) == '\n') {
                lines++;
            }
            if ((char) n == '\s') {
                words++;
            }
            if ((char) n != ' ') {
                chr++;
            }
            of.write(n);

        }

        System.out.println(
                "\n number pf lines " + lines + "\n number of characters :" + chr + "\nnumber of words :" + words);
        f.close();
        of.close();

    }

}
