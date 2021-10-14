package com.interview.navanee;
import java.util.Scanner;
public class InputGettingDouble 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height\n");
		Double height = sc.nextDouble();
		String eligibility = height >170 ? "are" : "are not";
		System.out.println("You "+eligibility+" eligible for Indian army");
	}
	
}
