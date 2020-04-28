package com.ProgrammingPractice;
//35. Write a program to find sum of first 10 Strong numbers?
public class Test35{
	public static void main(String[] args) {
		System.out.println("Sum of Strong Numbers up to 100000 ");
		int limit=100000;
		int total=0;
		for(int num=1;num<=limit;num++){
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
				//System.out.print(num+"");
				total=total+sum;
		}
		System.out.println(total);
	}
}
