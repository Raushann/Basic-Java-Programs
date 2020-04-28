package com.ProgrammingPractice;
//11. Write a program to find the sum of first N Odd numbers?
import java.util.Scanner;
public class Test11{
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) 
			if(i%2!=0) {
				sum=sum+i;
				}
		System.out.println("Sum of First "+n+" odd Number's "+sum);
	}
}
