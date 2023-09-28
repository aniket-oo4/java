import java.util.Scanner;
class array2{
    public static void main(String args[]){
        //multi dimenstional array
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("how many rows and cols you want");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("enter values for array element ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
            System.out.print("enter vslue for element::"+i+j);
            a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
            System.out.print(a[i][j]);
            }
            System.out.println("\n");
        }
    }
}