package com.ProgrammingPractice;

//3. Write a program to read two numbers and display the sum without using + Operator?
import java.util.Scanner;
public class Test3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First numbers to be added:");
		int a = sc.nextInt();
		System.out.println("Enter the Second numbers to be added:");
		int b= sc.nextInt();
		int carry;
		while (b != 0) {
			carry= a & b;
			a =a ^ b;
			b= carry << 1;
		}
			System.out.println("Sum is "+a);
		}
	}
