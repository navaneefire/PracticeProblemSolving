package com.interview.navanee.comparatorTwo;

import java.util.Arrays;
import java.util.Date;

public class TestArraySort 
{
	public static void main(String []args)
	{
		int array[] =  new int[20];
		for(int i=0;i<20;i++)
		{
			array[i]=(int)Math.round(Math.random()*100);
		}
		Arrays.sort(array);
		for(int i=0;i<20;i++)
		{
			System.out.print(array[i]+ " , ");
		}
		System.out.println("\n\n\n");
		Date[] dateArray = new Date[20];
		for(int i=0;i<20;i++)
		{
			Date dt = new Date();
			dt.setTime(new Date().getTime()+i*86400000);
			dateArray[19-i]=dt;
		}
		System.out.println(Arrays.asList(dateArray));
		Arrays.sort(dateArray);		
		System.out.println(Arrays.asList(dateArray));		
	}
}
