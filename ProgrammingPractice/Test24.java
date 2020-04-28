package com.ProgrammingPractice;

//24. Write a program to find whether the given number is a prime or not?
import java.util.Scanner;
public class Test24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		boolean flag=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Number is Prime "+num);
		else
			System.out.println("Number is not Prime "+num);
	}
}
