package com.interview.navanee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputGettingStringUsingBufferReader 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a description about you ");
		String description = br.readLine();
		System.out.println("Thanks For telling about your self");
	}
}
