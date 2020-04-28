package com.ProgrammingPractice;

//7. Write a program to read a Year and display whether it is leap year or not.
import java.util.Scanner;
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year ");
		int year = sc.nextInt();
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
            System.out.println("Year" + year+" is a leap year");
       else
	     System.out.println("Year " + year + " is not a leapyear");
	}
}