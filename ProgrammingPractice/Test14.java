package com.ProgrammingPractice;
//14. Write a program to display number of digits available in given number?
import java.util.Scanner;
public class Test14{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		System.out.println(" \n ** Individual Digit of a Number is * \n");
		int count =0;
		while(num!=0){
			int digit=num%10;
			System.out.println(digit);
			num=num/10;
			count++;
		}
		System.out.println("The Toal Digit in given input is :- "+count);
	}
}
