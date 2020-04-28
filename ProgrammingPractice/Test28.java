package com.ProgrammingPractice;

//28. Write a program to print the Armstrong numbers between 2 and 1000?
public class Test28{
	public static void main(String[] args) {
		System.out.println("Armstrong between 2 and 1000 ");
		int limit = 1000;
		for(int num=2;num<=limit;num++){
			int sum = 0;
			int num1 = num;
			while (num1 != 0) {
				int digit = num1% 10;
				sum = sum + (digit * digit * digit);
				num1 = num1/ 10;
			}
			if (sum == num)
				System.out.println("Number is Armstrong Number"+ sum);
		}
	}
}
