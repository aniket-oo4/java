
import java.util.*;
public class array2 {
// multidimensional arrays
// which array of reference  in which first array store addresses of another arrays 
public static void main(String args[])
{

    int a[][];
    a=new int[3][3]; //first dimension is row and second column
   a[0][0]=1;// 0th row  oth column ;
   a[0][1]=2;
   
   a[0][2]=3;
//    for(int i=0;i<3;i++)
//         {
//            System.out.print(a[0][i]);
//         }
        int b[][][]=new int [1][1][1];// 3 dimentional array
        b[0][0][0]=10;
        System.out.println(b[0][0][0]);

} 
    

}
