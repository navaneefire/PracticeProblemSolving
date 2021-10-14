package com.interview.navanee.comparatorTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections 
{
	
	public static void testingIntegerList()
	{
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			intList.add((int)Math.round(Math.random()*100));
		}	
		printList(intList);
		Collections.sort(intList);
		System.out.println("\nSorting done");
		printList(intList);
	}
	public static void printList(List<?> List)
	{
		for(Object a : List)
		{
			System.out.print(a+" , ");
		}
	}
	
	public static void main(String []args)
	{
		testingIntegerList();
		System.out.println();
		testingDoubleList();
		System.out.println();
		testingStringSort();
	}
	
	public static void testingDoubleList()
	{
		List<Double> doubleList = new ArrayList<Double>();
		for(int i=0;i<5;i++)
		{
			doubleList.add((double)Math.round(Math.random()*100));
		}	
		printList(doubleList);
		System.out.println(doubleList);
		Collections.sort(doubleList);
		System.out.println("\nSorting done");
		printList(doubleList);
	}
	public static void testingStringSort()
	{
		List<String> stringList = new ArrayList<String>();
		for(int i=0;i<5;i++)
		{
			stringList.add("random"+Math.round(Math.random()*100));
		}	
		printList(stringList);
		Collections.sort(stringList);
		System.out.println("\nSorting done");
		printList(stringList);
	}
	
}
