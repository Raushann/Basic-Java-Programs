package com.ProgrammingPractice;

//31. Write a program to print the Perfect numbers between 1 and 10000?
public class Test31{
	public static void main(String[] args) {
		System.out.println("Perfect Number Between 1-10000");
		int limit=10000;
		for(int num=1;num<=limit;num++){
			int sum=0;
			for(int i=1;i<num;i++){
				if(num%i==0)
					sum=sum+i;
			}
			if(sum==num)
				System.out.print(num+" ");
		}
	}
}
