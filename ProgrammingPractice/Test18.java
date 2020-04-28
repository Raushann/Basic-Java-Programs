package com.ProgrammingPractice;
//18. Write a program to display sum of squares of Individual digits of given number?
import java.util.Scanner;
public class Test18{
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		while(num!=0){
			int digit=num%10;
			//System.out.println(digit);
			int squareOfdigit=digit* digit;
			
			System.out.println("Square of each Indivisual digit is "+squareOfdigit);
			
			sum=sum+(squareOfdigit);
	
			num=num/10;
		}
		System.out.println("Sum of Square of Each Digit :"+sum);
	}
}