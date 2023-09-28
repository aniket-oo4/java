
import java.util.*;
class useraccount{
	public Scanner sc=new Scanner(System.in);
	protected float balance=0;
	public String username;
	protected  String pass;
	useraccount(){
		System.out.print("\033c");
		
		System.out.println("<<< WELCOME >>>\n You are new user \n Enter your name to register :");
		this.username=sc.nextLine();
		System.out.println("Enter Pin  for your account :");
		pass=sc.nextLine();
		while(pass.length()!=6)
		{
			System.out.println("\033c");
			if(pass.length()>6)
			System.out.println("PIN is  too long only six Digits allowed");
			else
				System.out.println("PIN is  short only six Digits allowed");
			System.out.println("Enter Pin  for your account :");
			pass=sc.nextLine();	
		}
		
		System.out.println("Enter Amountt for  your First deposit: ");
		this.balance=sc.nextFloat();
		
	}
	
	
	
}
class ATM extends useraccount{
		
		boolean pinValidate()
		{
			System.out.print("\033c");
			String tempPass;
			sc.nextLine();
			System.out.println("\n\nenter Your  6 digit Atm Pin here: ");
			tempPass=sc.nextLine();
			if(tempPass.equals(pass))
			{
				return true;
			}
			else 
				{
				System.out.println("Wrong pin !!!");
				return pinValidate();
				}
		}
		void withdrawAmt()
		{
			System.out.print("\033c");
			if(this.balance<=0)
			{
				System.out.println("Insufficient Balance !!!");
				
			}
			else {
				int tempAmt;
				System.out.println("Enter amout to withdraw :");
				tempAmt=sc.nextInt();
				if(tempAmt>this.balance)
				{
					System.out.println("Insufficient Balance !!! \n Your balance is lower than Amount you want to withdraw!! ");
				}
				else {
					System.out.println(tempAmt+" rs WIthdrawed Successfully '_' ");
					this.balance-=tempAmt;
				}				
			}			
		}
		void depositAmt() {
			System.out.print("\033c");// for clearing the out put screen 
					System.out.println("Enter total piece of per currency ");
					int t,f,h;
					System.out.println("Enter number of notes of rs.2000/-  :");
					t=sc.nextInt();
					System.out.println("Enter number of notes of rs.500/-  :");
					f=sc.nextInt();
					System.out.println("Enter number of notes of rs.100/-  :");
					h=sc.nextInt();
					t*=2000;f*=500;h*=100;					
					System.out.println("Your Total amount is :"+(t+f+h)+"rs");
					balance+=t+f+h;
					System.out.println((t+f+h)+"rs deposited Successfully  in your account");
			}
		void checkBalance() {
			System.out.print("\033c");
			System.out.flush();
			System.out.println("\n\n\nYour currrent Account balance is :"+balance+"rs ");
		}

}
public class task3 {
public Scanner sc=new Scanner(System.in);

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ATM obj=new ATM();
		String choice;
		System.out.print("\033c");
	System.out.println(" <<<< WELCOME TO ATM >>>>");
	if(obj.pinValidate()) {
System.out.println("Welcome User : "+obj.username+"");
	do {
		
		System.out.println("\n[1] : Withdraw \n[2] : Deposit\n[3] : Balance check\n[0] : exit\n Enter your choice::");
		choice=sc.nextLine();
		switch(choice)
		{ 
			case "1":
				obj.withdrawAmt();
				break;
			case "2":
				obj.depositAmt();
				break;
			case "3":
				obj.checkBalance();
				break;
			case "0":
				System.out.println("Exited from System");
				return;
			default:
				System.out.println("Enter Valid choice!!");
		}	
	}while(choice!="0");
	}
	}

}
/* 
 1.Create a class to represent the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.
  */
 