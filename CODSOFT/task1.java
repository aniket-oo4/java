import java.util.*;
class random_number{
    static int number;
     static Random rand=new Random();
   
    public static void  game()
    { 
        Scanner sc=new Scanner(System.in);
        int attempts=0,aflag=0;
        int fixed=rand.nextInt(101);
        System.out.print("\033c");
        System.out.println("Guesss the number !!! :  ");
        number=sc.nextInt();
    while(number!=fixed &&attempts<10)
    {   
        System.out.print("\033c");
        attempts++;
        if(number>100||number<0)
        {  
            System.out.print("\033c");
            System.out.println("number is not between 0 - 100");
            System.out.println(" please enter number between 0 - 100");
        }
        else if(number<fixed)
            {
            System.out.print("\033c");
            System.out.println("number is too low ");
            }
        else if(number>fixed)
        {
            System.out.print("\033c");
            System.out.println("number is too high ");
        }
        else if(attempts>10) 
        {
            System.out.print("\033c");
            System.out.println("Sorry!!! \n Attempts are over!!");
            aflag=1;
           break;
        }
        // System.out.print("\033c");
        System.out.println((10-attempts)+" more attempts remaining !\n\n");
        System.out.print("Enter Number here ::");
        number=sc.nextInt();
    }
    // if(aflag==1){
    //     System.out.print("\033c");
    //     System.out.println("DO you want to play Again \n If YES press 1\n If NO press 2\n");
    //     String  choice;
    //     System.out.print("enter your choice :");
    //     choice=sc.next();
    //     while(choice!="1"||choice!="2")
    //     {
    //     if(choice=="1")
    //         {
    //             game();
    //         }
    //     else if(choice=="2")
    //         {  
    //              System.out.print("\033c");
    //             System.out.println("THANK YOU FOR PLAYING !!");
    //             System.out.println("Exiting game ........");
    //         }
    //     else
    //         {
    //             System.out.print("\033c");
    //             System.out.println("enter Valid choice ");
    //             System.out.print("enter your choice :");
    //             choice=sc.next();
    //         }
    //     }
        
    //     }
        if(number==fixed)
        {
            System.out.print("\033c");
            System.out.println("*** VICTORY *** \n |___YOU WON___|");
        }
        else{
         System.out.print("\033c");
            System.out.println("*** GAME OVER *** \n |___YOU LOSE___|");   
        }


        // System.out.print("\033c");
        System.out.println("DO you want to play Again \n If YES press 1\n If NO press 2\n");
        int  choice;
        int flag=0;
        System.out.print("enter your choice :");
        choice=sc.nextInt();
        while(flag!=1)
        {

        if(choice==1)
            {
                flag=1;
                random_number.game();
            }
        else if(choice==2)
            {  
                flag=1;
                 System.out.print("\033c");
                System.out.println("THANK YOU FOR PLAYING !!");
                System.out.println("Exiting game ........");
                break;
            }
            else{
                 System.out.print("\033c");
                System.out.println("enter Valid choice ");
                System.out.print("enter your choice :");
                choice=sc.nextInt();
            }
               
        }      
       
    }
    
}

public class task1{
    public static void main(String args[])
    {
        String start;
        System.out.println("enter any key to Start the Game ::");
        Scanner sc=new Scanner(System.in);
        start=sc.nextLine();
        System.out.print("\033c");
        random_number.game();
        // System.out.println("DO you want to play Again \n If YES press 1\n If NO press 2\n");
        // int  choice;
        // int flag=0;
        // System.out.print("enter your choice :");
        // choice=sc.nextInt();
        // while(flag!=1)
        // {

        // if(choice==1)
        //     {
        //         flag=1;
        //         random_number.game();
        //     }
        // else if(choice==2)
        //     {  
        //         flag=1;
        //          System.out.print("\033c");
        //         System.out.println("THANK YOU FOR PLAYING !!");
        //         System.out.println("Exiting game ........");
        //         break;
        //     }
        //     else{
        //          System.out.print("\033c");
        //         System.out.println("enter Valid choice ");
        //         System.out.print("enter your choice :");
        //         choice=sc.nextInt();
        //     }
               
        // }
    }
}