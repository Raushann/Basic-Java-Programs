package com.ProgrammingPractice;

import java.util.Scanner;

public class Test39 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=s.next().charAt(0);

		if ((ch>='A' && ch<='Z') || (ch >='a' && ch <='z')) {

			switch (ch) {

			case 'A':
				
			case 'a':

			case 'E':
				
			case 'e':

			case 'I':
				
			case 'i':

			case 'O':
				
			case 'o':

			case 'U':
				
			case 'u':
				System.out.println("given character is vowel");
				break;


			default:
				System.out.println("Given Character is consonant");
				break;
			}
		}
		else {
			System.out.println("invalid Input");
		}
	}
}
