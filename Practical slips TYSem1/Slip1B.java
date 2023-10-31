import java.io.FileReader;
import java.io.*;
public class Slip1B{


    public static void main(String args[]) throws IOException
    {
        String hello="hello.txt",ans="";
        
        FileReader fr=new FileReader(hello);
        FileWriter fw=new FileWriter(hello);
         while(fr.read()!=-1)
         {
            ans+=fr.read();
            System.out.println(fr.read());
            
         }
         fw.write(fr.read());
        //  System.out.println(ans);

    }


 }