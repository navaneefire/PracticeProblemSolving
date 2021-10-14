package com.interview.amazon;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class FindTriplet 
{
	public static void findTriplet(Integer [] arr)
	{
		List<Integer> squaredArr = new LinkedList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			squaredArr.add(arr[i]*arr[i]);
		}
		Collections.sort(squaredArr);
		System.out.println(squaredArr);
		for(int i=squaredArr.size()-1;i>=0;i--)
		{
			int sum = squaredArr.get(i);			
			List<String> pairs = findSumPair(squaredArr,0,i-1,sum);			
			for(String pair : pairs)
			{
				String [] couple = pair.split(",");
				int a = Integer.parseInt(couple[0]);
				int b = Integer.parseInt(couple[1]);
				int tripletAIndex = squaredArr.indexOf(a);
				int tripletBIndex = squaredArr.indexOf(b);
				
				System.out.println("tripletASquare ="+a);
				System.out.println("tripletBSquare ="+b);
				System.out.println("tripletCSquare ="+sum);
				
				
				System.out.println("tripletA ="+Math.sqrt(squaredArr.get(tripletAIndex)));
				System.out.println("tripletB ="+Math.sqrt(squaredArr.get(tripletBIndex)));
				System.out.println("tripletC ="+Math.sqrt(squaredArr.get(i)));
				
				System.out.println("tripletAIndex ="+tripletAIndex);
				System.out.println("tripletBIndex ="+tripletBIndex);
				System.out.println("tripletCIndex ="+i);
				System.out.println("\n\n\n\n\n\n");
			}
		}
	}
	public static List<String> findSumPair(List<Integer> array , int startIndex , int endIndex , int sum)
	{		
		List<String> sumPair = new LinkedList<String>();
		List<Integer> hashSet = new LinkedList<Integer>();
		for(int i=startIndex;i<=endIndex;i++)
		{
			int diff = sum - array.get(i);			
			if(hashSet.contains(diff))
			{				
				sumPair.add(""+array.get(i)+","+diff);
			}
			hashSet.add(array.get(i));
		}		
		return sumPair;
	}
	public static void main(String[] args)
    { 
		Long startTime = System.currentTimeMillis();
		System.out.println("Start Time =" + startTime);		
        Integer arr[] = { 3, 1, 4,15,17, 6, 5,11,60,61,12,13,8 };
        findTriplet(arr);
        Long endTime = System.currentTimeMillis();
        System.out.println("End Time ="+endTime);
        System.out.println("Time taken = "+(endTime-startTime));
    }
}
