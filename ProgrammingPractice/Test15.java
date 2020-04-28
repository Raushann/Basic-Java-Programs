package com.ProgrammingPractice;

//15. Write a program to display number of even and odd digits available in given number?
import java.util.Scanner;
public class Test15{
	public static void main(String[] args) {
		int edigit=0,odigit=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		while(num!=0){
			int digit=num%10;
			if(digit%2==0)
				edigit++;
			else
				odigit++;
			num=num/10;
		}
		System.out.println("Total Number of Even Digit "+edigit);
		System.out.println("Total Number of Odd Digit "+odigit);
	}
}
