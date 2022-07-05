package Conditionalstatement;

import java.util.Scanner;

public class Daysinamonthprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);

		
		System.out.println("Enter a value to calculate days in a month");
		
		int a=sc.nextInt();
		int year=sc1.nextInt();
		
		switch(a)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			
			System.out.println("31 Days");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			
			System.out.println("30 Days");
			break;
			
		case 2:
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
		System.out.println("29 Days");
			}
			else {
				System.out.println("28 Days");
			}
		break;
			
		default: System.out.println("Invalid Input");
		}
		

	}

}
