package com.ProgrammingPractice;

//25. Write a program to print the prime numbers between 100 and 1000?
public class Test25{
	public static void main(String[] args) {
		System.out.println("Prime Number between 100-1000 Number is :-");
		int limit=1000;
		for(int num=100; num<=limit;num++){
			boolean flag=true;
			for(int i=2;i<num;i++){
				if(num%i==0){
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(num+" ");
		}
	}
}
