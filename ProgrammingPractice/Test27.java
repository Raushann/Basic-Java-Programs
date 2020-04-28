package com.ProgrammingPractice;

//27. Write a program to find whether the given number is a Armstrong or not?
import java.util.Scanner;
public class Test27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int sum=0,num1=num;
		while(num!=0){
			int digit=num%10;
			sum=sum+(digit* digit* digit);
			num=num/10;
		}
		if(sum==num1)
			System.out.println("Number is an Armstrong Number "+num1);
		else
			System.out.println("Number is Not an Armstrong Number"+num1);
	}
}
