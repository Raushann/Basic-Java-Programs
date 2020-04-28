package com.ProgrammingPractice;

//22. Write a program to find whether the given number is a Palindrome or not?
import java.util.Scanner;
public class Test22{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int sum=0;
		int num1=num;
		while(num!=0){
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(sum==num1)
			System.out.println("Number is palindrome : "+num1);
		else
			System.out.println("Number is not a palindrome : "+num1);
	}
}
