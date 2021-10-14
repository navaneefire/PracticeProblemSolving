package com.interview.navanee;

public class FindMaxDiff 
{
	public static int findProfitSpread(int []numArray)
	{		
		boolean continuedDecrease=true;
		int maxDiff = Integer.MIN_VALUE;
		int minValue = numArray[0];
		int maxValue = numArray[0];
		int minValIndex = 0;
		int maxValIndex = 0;
		for(int i=1;i<numArray.length;i++)
		{
			int val1=numArray[i-1];
			int val2 = numArray[i];
			if(val2<minValue)
			{
				minValue=val2;
				minValIndex=i;
			}
			else if(val2>maxValue)
			{
				maxValue=val2; 
				maxValIndex=i;
			}
			System.out.println("minvalue at index "+i+ "is "+minValue);
			System.out.println("maxvalue at index "+i+ "is "+maxValue);
			if(val1>=val2 && continuedDecrease)
			{
				continue;
			}
			else
			{
				if(continuedDecrease)
				{	
				System.out.println("not continuously decreasing from index"+i);
				}
				continuedDecrease=false;
				int maxDiffTemp=maxValue-minValue;
				if(maxDiffTemp>maxDiff && minValIndex<maxValIndex)
				{
					maxDiff=maxDiffTemp;
					System.out.println("max diff changed at index"+i);
					System.out.println("new max diff is "+maxDiff);
				}
				
			}
			System.out.println("\n\n");
		}
		if(continuedDecrease)
		{
			return -1;
		}
		else
		{
			return maxDiff;
		}
	}
	
	public static void main(String []args)
	{
		int[] numArray=new int[10];
		
		for(int i=0;i<10;i++)
		{
			numArray[i]=(int)Math.round(Math.random()*100);
			
		}
		
//		numArray =  new int[] {7,5,2,1};
		
		System.out.print("array values - ");
		for(int i=0;i<numArray.length;i++)
		{
			System.out.print(numArray[i]+ " ");
		}
		System.out.println();
		
		
		
		System.out.println(findProfitSpread(numArray));
	}
}
