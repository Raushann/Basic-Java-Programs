package com.ProgrammingPractice;

//33. Write a program to find whether the given number is a Strong or not?
import java.util.Scanner;
public class Test33{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num=sc.nextInt();
		int sum=0;
		int num1=num;
		while(num1!=0){
			int digit=num1%10;
			int fact=1;
			for(int j=1;j<=digit;j++)
				fact=fact*j;
			sum=sum+fact;
			num1=num1/10;
		}
		if(sum==num)
			System.out.println("Number is Strong Number "+num);
		else
			System.out.println("Number is Not Strong Number	"+num); 
	}
}