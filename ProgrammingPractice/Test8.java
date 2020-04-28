package com.ProgrammingPractice;

/*8. Write a program to read a char and check the following
a) Upper Case Alphabet
b) Lower Case Alphabet
c) Digit
d) Special Characters
 */

public class Test8{
	public static void main(String[] args)throws Exception{
		System.out.println("Enter a Character ");
		char ch=(char)System.in.read();
		if(ch>=65&& ch<=90)
			System.out.println("Character is Upper case :"+ch);
		else if(ch>=97&& ch<=122)
			System.out.println("Character is Lower case :"+ch);
		else if(ch>=48&& ch<=57)
			System.out.println("Character is Digit :"+ch);
		else
			System.out.println("Character is Special Character:"+ch);
	}
}

