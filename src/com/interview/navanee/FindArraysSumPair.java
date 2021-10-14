package com.interview.navanee;

import java.util.Arrays;

public class FindArraysSumPair 
{
	public static void findArraysPair(int[] array1,int[] array2,int sum)
	{
		Arrays.sort(array1);
		Arrays.sort(array2);
		int array1MaxIndex = findMinSortedArray(array1,sum);
		int array2MaxIndex = findMinSortedArray(array2,sum);
		
		while(array1MaxIndex>0 && array2MaxIndex>0)
		{	
			int array1Value = array1[array1MaxIndex];
			int diff = sum-array1Value;
			int array2ValIndex  = findMin(array2,diff);
			
			if(array2ValIndex == -1)
			{
				return;
			}
			else
			{
				int array2Value = array2[array2ValIndex];
				System.out.println(array1Value + " " + array2Value);
				array1MaxIndex--;
				array2MaxIndex++;
			}
		}
	}
	
	public static int findMin(int[] array,int val)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==val)
			{
				return i;
			}
		}
		return -1;
	}
	public static int findMinSortedArray(int array1[],int sum)
	{		
		int array1MaxValIndex=Integer.MIN_VALUE;
		boolean maxValFound=false;
		for(int i=array1.length-1;i>=0;i--)
		{
			if(array1[i]<=sum)
			{				
				array1MaxValIndex = i;
				maxValFound =true;
			}
		}
		if(!maxValFound)
		{
			return -1; 			
		}
		else
		{
			return array1MaxValIndex;
		}
	}
	
	
	
	public static void main(String[] args)
	{
		int[] array1 = new int[]{-1, -2, 4, -6, 5, 7};
		int[] array2 = new int[]{6, 3, 4, 0};
		
	}
}
