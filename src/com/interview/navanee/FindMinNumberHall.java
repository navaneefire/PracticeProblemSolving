package com.interview.navanee;

public class FindMinNumberHall 
{
	public static int findMinNumberHall(int array[][])
	{
		int timePeriod[]=new int[1000001];
		for(int i=0;i<array.length;i++)
		{	
			int val1 = array[i][0];
			int val2 = array[i][1];

			for(int j=val1;j<=val2;j++)
			{
				timePeriod[j]++;
			}
		}
		System.out.println();
		for(int i=0;i<timePeriod.length;i++)
		{	
			if(timePeriod[i]==0)
			{
				break;
			}
			System.out.print(timePeriod[i]+" ");			
		}
		System.out.println();
		int maxValue = Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(timePeriod[i]>maxValue)
			{
				maxValue=timePeriod[i];
			}
		}
		return maxValue;
	}
	public static void main(String []args)
	{
		int array[][] = new int[10][2];
		array = new int[][] {{0, 5}, {1, 2}, {1, 10}} ;
		System.out.println("min number of halls required is "+findMinNumberHall(array));
	}
}
