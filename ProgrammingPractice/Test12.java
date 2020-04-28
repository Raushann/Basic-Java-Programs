package com.ProgrammingPractice;

//12. Write a program to print first N Even numbers?
import java.util.Scanner;
public class Test12{ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
			if(i%2==0)
				System.out.print(i+" ");
	}
}
