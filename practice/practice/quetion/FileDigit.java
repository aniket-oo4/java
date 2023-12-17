import java.io.*;


public class FileDigit {
    
public static void main(String args[]) throws IOException,FileNotFoundException

{

    int n,digits=0,spaces=0,chr=0;
    FileInputStream f=new FileInputStream("in.txt");
    FileOutputStream of=new FileOutputStream("out.txt", false);

    while((n=f.read())!=-1)
    {

        System.out.print((char) n);
        if(Character.isDigit((char)n)){
digits++;
}
    if(Character.isSpaceChar((char)n))
    {
        spaces++;
    }
     if((char)n!= ' ')
    {
        chr++;
    }
            of.write(n);
            
    }   
    
    
        System.out.println("\n number pf digits  "+digits+"\n number of characters :"+chr+"\nnumber of spaces  :"+spaces);
f.close();
of.close();

}

}
