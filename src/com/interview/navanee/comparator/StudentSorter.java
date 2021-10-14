package com.interview.navanee.comparator;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> 
{

	@Override
	public int compare(Student a, Student b) 
	{		
		return a.getAge() - b.getAge();
	}
	
}
