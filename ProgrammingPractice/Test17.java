package com.ProgrammingPractice;

//17. Write a program to find sum of even digits and sum of odd digits available in given number?
import java.util.Scanner;
public class Test17{
	public static void main(String[] args) {
		int esum=0,osum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		while(num!=0){
			int digit=num%10;
			if(digit%2==0)
				esum=esum+digit;
			else
				osum=osum+digit;
			num=num/10;
		}
			System.out.println("Sum of Even Digit "+esum);
			System.out.println("Sum of Odd Digit "+osum);
		}
	
}
