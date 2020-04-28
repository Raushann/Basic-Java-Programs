package com.ProgrammingPractice;

//6. Write a program to print first N natural numbers?
import java.util.Scanner;
public class Test6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		if(n>=1){
			for(int i=1;i<=n;i++)
				System.out.print(i+" ");
		}
	}
}
