package com.ProgrammingPractice;

//16. Write a program to find the sum of individual digits of given number?
import java.util.Scanner;
public class Test16{
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		while(num!=0){
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("\n  Sum Individual Digit of a Number is * "+sum);
	}
}

