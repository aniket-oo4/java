package Basics;

import java.util.*;

public class switch_case {

	public static void main(String[] args) {
		// if we use multiple if else conditions it was little bit messy and complex
		// hence we use switch case to get needed output
////		int x = 4;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value :");
		String name=sc.nextLine();// in java only string integer and enum ,and also seperate char 
		switch (name.toLowerCase()) {// sequence does not matter in switch case we can write any case in any order 
		case "helo":
			System.out.println(" value of x is helo");
			break;// break keyword is used to break the flow of switch case
		case "aniket":
			System.out.println(" value of x is aniket");
			break;
		case "vijay":
			System.out.println(" value of x is vijay");
			break;
		case "varkhade":
			System.out.println(" value of x is varkhade");
			break;
		default:
			System.out.println(" value of x is not between 1-4");
			break;
		}
//		char x = 'C';//a
//		switch (x) {// sequence does not matter in switch case we can write any case in any order 
//		case 'a'://we can achieve this because there is no break after case a hence switch case executes a case after that case automatically 
//		case 'A':	
//			System.out.println(" value of x is a");
//			break;// break keyword is used to break the flow of switch case
//		case 'b':
//		case 'B':
//			System.out.println(" value of x is b");
//			break;
//		case 'c':
//		case 'C':	
//			System.out.println(" value of x is c");
//			break;
//		default:
//			System.out.println(" value of x is not between a-c");
//			break;
//		}
		
		
		
// all if else situationa cannot be solve using switch case but all switch cases will be solve by usin if else  both are control statements in programming 
	}

}
