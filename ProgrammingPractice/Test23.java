package com.ProgrammingPractice;

/* 23. Write a progtam to read a number and display in word.
Input: 23456
Output: Two Three Four Five Six
 */
import java.util.Scanner;
public class Test23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		String msg="";
		while(num!=0){
			int rem=num%10;
			switch(rem){
			case 0: msg=" Zero "+msg; break;
			case 1: msg=" One "+msg; break;
			case 2: msg="Two "+msg; break;
			case 3 : msg=" Three "+msg; break;
			case 4: msg="Four "+msg; break;
			case 5: msg=" Five "+msg; break;
			case 6: msg=" Six "+msg; break;
			case 7: msg=" Seven "+msg; break;
			case 8: msg=" Eight "+msg; break;
			case 9: msg=" Nine "+msg; break;
			}
			num=num/10;
		}
		System.out.println(msg);
	}
}
