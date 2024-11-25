package stringmethod;

import java.util.Scanner;

public class StaticFactorial {
	//
	static int num;
	 static long result=1;

	//public static void getdetails() {
	
		

	public static void calcu() {
		

		for (int i = 1; i <= num; i++) {
			result =result*i;
	
	}
		System.out.println("Factorial of "+ num + "is" + result);

	
	}

	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		num = s.nextInt();
		//StaticFactorial.getdetails();
		StaticFactorial.calcu();
		//StaticFactorial.displaydetails();

	}

}
