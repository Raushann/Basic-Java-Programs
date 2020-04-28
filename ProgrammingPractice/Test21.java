package com.ProgrammingPractice;

//21. Write a program to find the reverse of a given number?
import java.util.Scanner;
public class Test21{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Revers of a number is : "+rev);
	}
}