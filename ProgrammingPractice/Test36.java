package com.ProgrammingPractice;

//36. Write a program to print first 10 numbers of Fibonacci series?
public class Test36{
	public static void main(String[] args) {
		System.out.println("First 10 Fibonacci Number ");
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		int c=a+b;
		for(int i=3;i<=10;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}