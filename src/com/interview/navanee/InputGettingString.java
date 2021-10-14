package com.interview.navanee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class InputGettingString 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your feelings");
		String feeling = br.readLine();
		System.out.println(feeling.toUpperCase());
		System.out.println(feeling.lastIndexOf('2',8)!=-1);
		String s1 = new String(feeling.toCharArray());
		s1 = s1.toLowerCase();
		s1 = s1.replace("ool", "uck");
		s1 =s1.substring(0,4);
		s1.isBlank();
		System.out.println(s1.charAt(2) == s1.charAt(3));
		System.out.println(s1.toCharArray());
		System.out.println(s1);
	}
}
