package Calculation;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) 
	{
		System.out.println("\t\t\tWelcome to Calculator Application");
		Scanner ss=new Scanner(System.in);
		int s,t;
		System.out.println("Enter Your first number:");
		s=ss.nextInt();
		System.out.println("Enter Your second number:");
		t=ss.nextInt();
		System.out.println("Select your Operation:");
		System.out.println("Operation 1: Addition");
		System.out.println("Operation 2: Subtraction");
		System.out.println("Operation 3: Multiplication");
		System.out.println("Operation 4: Divition");
		System.out.println("Operation 5:Exit");
		int x;
		for(int w=0;w<5;w++) {
		x=ss.nextInt();
		switch(x)
		{
		case 1:
			System.out.println("The addition operation result: "+(s+t));
			break;
		case 2:
			System.out.println("The Subtraction operation result: "+(s-t));
			break;
		case 3:
			System.out.println("The Multiplication operation result: "+(s*t));
			break;
		case 4:
			System.out.println("The Divition operation result: "+(s/t));
			break;
		case 5:
			System.out.println("================***Bye have a Nice day***================");
			break;
			
		}}
	}

}
