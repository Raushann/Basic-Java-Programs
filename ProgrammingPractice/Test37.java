package com.ProgrammingPractice;

//37. Write a program to find sum of first 10 numbers of Fibonacci series?
public class Test37{
	public static void main(String[] args) {
		System.out.println("First 10 Fibonacci Numbers are :- ");
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		int sum=a+b;
		int c=a+b;
		for(int i=3;i<=10;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			sum=sum+c;
		}
		System.out.println("\nSum Of the First 10 Fibonacci Number is:-  "+sum);
	}
}
