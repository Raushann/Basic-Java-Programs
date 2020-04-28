package com.ProgrammingPractice;

//9. Write a program to find the sum of first N natural numbers?
import java.util.Scanner;
public class Test9{
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		if(n>=1){
			for(int i=1;i<=n;i++)
				sum=sum+i;
			System.out.println("Sum of First n Natural Number is :"+sum);
		}

	}
}