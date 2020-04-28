package com.ProgrammingPractice;

import java.util.Scanner;
//38. Write a program to print Nth Fibonacci number.
class Test38 { 
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Nth Number ");
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		int c=0; 
		if (n == 0) {
			System.out.println(a);
		}
		for (int i = 3; i <=n; i++) { 
			c = a + b; 
			a = b; 
			b = c; 
		} 
		System.out.println(b); 
	} 
} 

