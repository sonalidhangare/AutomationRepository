package Conditionalstatement;

import java.util.Scanner;

public class ScannerFunction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		//Scanner sc2=new Scanner(System.in);
		
		System.out.println("Enter a first number");
		
		int a=sc.nextInt();
		
		System.out.println("Enter a second number");
		
		int b=sc1.nextInt();
		
		if(a>b)
		{
			System.out.println("A is greater Number");
		}	
		
		if(b>a) {
			
			System.out.println("B is greater number");
		}
		
		if(a==b)
		{
			System.out.println("Both Numbers are equal");
		}

	}

}
