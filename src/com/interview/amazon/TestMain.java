package com.interview.amazon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMain 
{
	public static void main(String[] args)
	{
		testArraySort();
		testCollectionSort();
	}
	public static void testArraySort()
	{
		long array[] = new long[] { 16, 12, 14, 9, 30, 2, 50 ,45 };
		Long arr[] = Arrays.stream(array).boxed().toArray(Long[] :: new);
		Arrays.sort(arr,0,3);		
		System.out.println(Arrays.asList(arr));
	}
	public static void testCollectionSort()
	{
		Integer arr[] = new Integer[] { 1, 23, 12, 9, 30, 2, 50 ,45 };	
		List<Integer> intList = Arrays.asList(arr);
		Collections.sort(intList);
		
		System.out.println(intList);
	}
}
