package com.interview.navanee;

import java.util.Scanner;

public class InputGettingClass 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name\n");
		String name = sc.next();
		System.out.println("Hi "+name+" How are you?");
	}
}
