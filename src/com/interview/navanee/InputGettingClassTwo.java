package com.interview.navanee;

import java.util.Scanner;

public class InputGettingClassTwo 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Hi "+name+" how are you?");
	}
}
