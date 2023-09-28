import java.util.Scanner;
public class marks {

    public static void main(String args[])
    {
        int math,science,marathi,hindi,english,total,percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your all subject marks:::"+"\n");
        System.out.println("marathi::\n");
        marathi =sc.nextInt();
        System.out.println("HINDI::\n");
        hindi =sc.nextInt();
        System.out.println("english::\n");
        english   =sc.nextInt();
        System.out.println("math::\n");
        math=sc.nextInt();
        System.out.println("Science::\n");
        science=sc.nextInt();
        total=marathi+math+hindi+english+science;
        System.out.println(total);
        percentage=total/5;
        System.out.println("Total percentage you obtsined are ::"+percentage);  
        
    }
}
