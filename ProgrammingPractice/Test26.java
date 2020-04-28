package com.ProgrammingPractice;

//26. Write a program to find sum of first 10 prime numbers?
public class Test26{
	public static void main(String[] args) {
		System.out.print("Sum of Prime Number Upto 10 Number is : ");
		int limit=10;
		int sum=0;
		for(int num=1;num<=limit;num++){
			boolean flag=true;
			for(int i=2;i<num;i++){
				if(num%i==0){
					flag=false;
					break;
				}
			}
			if(flag)
				sum=sum+num;
		}
		System.out.println(sum);
	}
}
