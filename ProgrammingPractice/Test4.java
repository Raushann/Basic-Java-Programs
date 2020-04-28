package com.ProgrammingPractice;

//4. Write a program to read two numbers and display its quotient without using / Operator?
import java.util.Scanner;
public class Test4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers For Division:");
		int a = sc.nextInt();
		System.out.println("Enter the numbers For Divisor");
		int b = sc.nextInt();
		int quotient = 0;
		while (a >=b) {
			a -= b;
			quotient++;
		}
		System.out.println("Quotient is "+quotient);
	}
}
