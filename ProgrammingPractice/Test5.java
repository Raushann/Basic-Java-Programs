package com.ProgrammingPractice;

//5. Write a program to read two numbers and display its remainder without using % Operator?
import java.util.Scanner;
public class Test5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value for division ");
		int a = sc.nextInt();
		System.out.println("Enter Value for divisor ");
		int b = sc.nextInt();
		int rem = a - (a/b)*b;
		System.out.println("Remainder "+rem);
	}
}
