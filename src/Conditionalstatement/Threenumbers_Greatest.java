package Conditionalstatement;

import java.util.Scanner;

public class Threenumbers_Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter a First number");
		int a=sc.nextInt();
		System.out.println("Enter a second number");
		int b=in.nextInt();
		System.out.println("Enter a Third number");
		int c=sc1.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is greater number");
		}

		if(b>a && b>c)
		{
			System.out.println("B is greater number");
		}
		
		if(c>a && c>b)
		{
			System.out.println("C is greater number");
		}	

		
		

	}

}
