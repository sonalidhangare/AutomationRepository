package Conditionalstatement;

import java.util.Scanner;

public class ScannerFunction_Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Value");
		
		String ch=sc.nextLine();
		
		switch(ch)
		{
		case "1":System.out.println("Sunday");
		break;
		
		case "2":System.out.println("Monday");
		break;
		
		case "3":System.out.println("Tuesday");
		break;
		
		case "4":System.out.println("Wed");
		break;
		
		case "5":System.out.println("Thursday");
		break;
		
		case "6":System.out.println("Friday");
		break;
		
		case "7":System.out.println("Saturday");
		break;
		
		default:System.out.println("You have entered wrong value");
		}

	}

}
