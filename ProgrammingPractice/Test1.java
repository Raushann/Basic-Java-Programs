package com.ProgrammingPractice;

// How to swap two numbers without using temporary variable?
import java.util. Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Value ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Value ");
		int b = sc.nextInt();
		System.out.println("Before swap \na = "+a+"\nb ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap\na = "+a+"\nb ="+b);
	}
}