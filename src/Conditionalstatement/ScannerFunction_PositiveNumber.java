package Conditionalstatement;

import java.util.Scanner;

public class ScannerFunction_PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("Number is positive");
		}	
		else
		{
			System.out.println("Number is Negative");
		}	
		

	}

}
