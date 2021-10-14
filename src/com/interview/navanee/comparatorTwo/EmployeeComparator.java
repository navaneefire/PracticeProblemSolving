package com.interview.navanee.comparatorTwo;

import java.util.Comparator;

class EmployeeComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee a, Employee b) 
	{		
		return a.getExperience()-b.getExperience();
	}

}
