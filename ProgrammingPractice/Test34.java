package com.ProgrammingPractice;

//34. Write a program to print the Strong numbers between 100 and 100000?
public class Test34{
	public static void main(String[] args) {
		System.out.println("Strong Number Between 100-100000 ");
		int limit=100000;
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
				System.out.print(num+" ");
		}
	}
}
