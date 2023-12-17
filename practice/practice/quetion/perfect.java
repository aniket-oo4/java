import java.util.*;
public class perfect{



    public  static void main(String args[])
    {

        int num;
        System.out.println("Entter number :");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
for(int i=1;i<=num;i++)
{
  int n=i,sum=0;
  for(int j=1;j<n;j++)
  {

  if(n%j==0)
    {
        sum+=j;
   }

  }

  if(n==sum)
        {
            System.out.println(n+"is perfect ");
        }
}
    }
    


}