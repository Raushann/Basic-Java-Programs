package com.ProgrammingPractice;

//30. Write a program to find whether the given number is a perfect or not?
import java.util.Scanner;
public class Test30{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==num)
			System.out.println("Number is perfect Number "+num);
		else
			System.out.println("Number is Not perfect Number "+num);
	}
}
