package com.interview.navanee;

import java.util.Arrays;

public class FindPair 
{
	public static int findNoOfDistinctPair(int []numArray,int sum)
	{		
		Arrays.sort(numArray);
		System.out.print("sorted array values - ");
		for(int i=0;i<numArray.length;i++)
		{			
			System.out.print(numArray[i]+ " ");
		}
		System.out.println();
		int returnValue=0;
		boolean found = false;
		int maxIndex =-1;
		for(int i=numArray.length-1;i>0;i--)
		{
			if(numArray[i]<sum)
			{
				  found= true;
				  maxIndex = i;
				  break;
			}
		}
		if(found)
		{
			System.out.print("max value is "+numArray[maxIndex]+"at index "+maxIndex);
			int minIndex=0;
			while(minIndex<maxIndex)
			{
				boolean pairFound = false;
				int i;
				for(i=minIndex;i<maxIndex && numArray[i]+numArray[maxIndex]<=sum;i++)
				{
					if(numArray[i]+numArray[maxIndex]== sum)
					{
						returnValue++;
						pairFound=true;
						break;
					}
				}
				if(pairFound)
				{
					System.out.println(String.format("pair found %d ,%d",numArray[maxIndex],numArray[i]));
					maxIndex--;
					minIndex=i+1;
				}
				else
				{
					System.out.println("no element found for"+ numArray[maxIndex]+"at index"+maxIndex);
					maxIndex--;
				}
			}
			return returnValue;
			
		}
		else
		{
			return returnValue;
		}
	}
	public static void main(String []args)
	{
		int[] numArray=new int[10];
		
		for(int i=0;i<10;i++)
		{
			numArray[i]=(int)Math.round(Math.random()*100);
			
		}
		
		numArray =  new int[] {5,7,9,13,11,6,6,3,3};
		
		System.out.print("array values - ");
		for(int i=0;i<numArray.length;i++)
		{
			System.out.print(numArray[i]+ " ");
		}
		System.out.println();
		
		
		
		System.out.println(findNoOfDistinctPair(numArray,12));
	}
}
