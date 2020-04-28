package com.ProgrammingPractice;

//20. Write a program to display sum of factorials of Individual digits of given number?
import java.util.Scanner;
public class Test20{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int factsum=0;
		while(num!=0){
			int fact = 1;
			int digit=num%10;
			for (int i = 1; i <= digit; i++)
				fact = fact * i;
			factsum=factsum+fact;
			num=num/10;
		}
		System.out.println("Sum :" + factsum);
	}
}
