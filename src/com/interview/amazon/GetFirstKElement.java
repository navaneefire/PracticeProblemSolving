package com.interview.amazon;

import java.util.Arrays;

public class GetFirstKElement 
{
	public static Integer[] getFirstKElement(Integer[] arr , int k)
	{
		Integer []result = new Integer[k];
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			result[i]=arr[i];
		}
		return result;
	}
	public static void main(String ...args)
	{
		Integer[] arr = new Integer[] {12, 14, 16, 9, 30, 2, 50, 45};
		System.out.println(Arrays.asList(getFirstKElement(arr,4)));
	}
}
