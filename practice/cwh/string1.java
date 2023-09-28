import java.util.*;
public class string1{
    public static void  main( String arggs[])
    {

        String str="hello Bhave Kasa ahes ";
        System.out.println(str.length());
        //System.out.println(str.toLowerCase()+"   this string by Lower case");//toLowerCase()
        //System.out.println(str.toUpperCase()+ "   this string by uppercase");// toUpperCase()
        //str="                  hello     ";
        //System.out.println(" non trimedd string ::"+str);
        //System.out.println("trimeed :: "+ str.trim()); // trim() removes  left and right spaces   of string 
        //str="hello Bhave Kasa ahes ";
        //System.out.println(str.substring(5,10));//  5-9  sustring( start , end ); substring(2) 2-last 
        str="harry";
       // System.out.println(str.replace('r', 'p')); // replace ('old char','new char ')
       // System.out.println(str);
       // System.out.println(str.replace("r","hallo"));//replace all occurence of r by hallo
       // System.out.println(str.replace("rry","new string"));
       // System.out.println(str.startsWith("ar", 1));  //startsWith(" start str",start index)
        // System.out.println(str.charAt(3)); // return specific character at this index 
        // System.out.println(str.indexOf("ari"));  //indexOf("r", 0) false returns -1; if true return index 
        // System.out.println(str.indexOf("ar",0)); 
        //System.out.println(str.lastIndexOf("r")); // lastIndexOf( ) function starts finding from last  reverse means from 4 to 0 
        // System.out.println(str.lastIndexOf("r",2)); //start searching from 2 to 0
        // System.out.println(str.equals("hArry")); // returns false 
        // System.out.println(str.equalsIgnoreCase("HarrY"));  // ignores case 
        // str=" \"hello i am helo \"";  // using escape sequence for printing  " "quotes within quotes \t \n \v \' \\
        // System.out.println(str);
        // str=str+" nkdakn";
        // System.out.println(str);
        // str="my name is hello ";
        // System.out.println(str.replace("hello","aniket"));
         str=" \"hello i am helo   \"  "; 
        System.out.println(str.indexOf("   ", 4));
        //  System.out.println(str.lastIndexOf("  ", str.length()));
        str="dear aniket ,\n\t how are you ,\n\t i want to meet you";
        System.out.println(str);


    }
}