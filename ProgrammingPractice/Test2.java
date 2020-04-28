package com.ProgrammingPractice;

//2. How to swap two numbers with using Bitwise Operators?
import java.util.Scanner;
public class Test2{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Value ");
		int a = sc.nextInt();
		System.out.println("Enter Second Value ");
		int b = sc.nextInt();
		System.out.println("Before swap \n a ="+a+"\n b ="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap \n a ="+a+"\n b ="+b);
	}
}
