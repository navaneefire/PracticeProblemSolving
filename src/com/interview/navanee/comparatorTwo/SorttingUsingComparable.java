package com.interview.navanee.comparatorTwo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SorttingUsingComparable 
{
	public static void main(String []args)
	{
		List<Employee> employeeList = new ArrayList<Employee>();
		for(int i=0;i<5;i++)
		{
			Employee employee = new Employee("random"+i, (int)Math.round(Math.random()*100));
			employeeList.add(employee);
		}
		printEmployeeList(employeeList);
		Collections.sort(employeeList);
		
		System.out.println("sorting done".toUpperCase()+"\n\n\n");
		printEmployeeList(employeeList);
		
	}
	public static void printEmployeeList(List<Employee> employeeList)
	{
		for(Employee employee : employeeList)
		{
			System.out.println(employee);
		}
	}
}
