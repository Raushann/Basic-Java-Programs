package com.ProgrammingPractice;

//19. Write a program to display sum of cubes of Individual digits of given number?
import java.util.Scanner;
public class Test19{
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		while(num!=0){
			int digit=num%10;
			int cubeofdigit=digit* digit* digit;
			System.out.println("Cube of Each indivisual digit "+cubeofdigit);
			sum=sum+(cubeofdigit);
			num=num/10;
		}
		System.out.println("Sum of Cube of Each Digit: "+sum);
	}
}
