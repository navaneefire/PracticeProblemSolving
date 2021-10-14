package com.interview.navanee.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestSorting 
{
	public static void main(String []args)
	{
		ArrayList<Student> studentList = new ArrayList<Student>();
		for(int i=0;i<10;i++)
		{
			studentList.add(new Student("random"+(i+1),(int)Math.round((Math.random()*100))));
		}
		printObj(studentList);
		System.out.println("\n");
		Collections.sort(studentList,new StudentSorter());
		printObj(studentList);
	}
	public static void printObj(ArrayList<Student> studentList)
	{
		for(Student stud : studentList)
		{			
			System.out.println(stud);
		}
	}
}

