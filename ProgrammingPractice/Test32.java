package com.ProgrammingPractice;

//32. Write a program to find sum of first 10 Perfect numbers?
public class Test32{
	public static void main(String[] args) {
		System.out.println("Sum of Perfect Number up to 10000 is ");
		int limit=10000;
		int total=0;
		for(int num=1;num<=limit;num++){
			int sum=0;
			for(int i=1;i<num;i++){
				if(num%i==0)
					sum=sum+i;
			}
			if(sum==num) {
				//System.out.print(num+" ");
				total=total+sum;
			}
		}
		System.out.println(total);
	}
}

