package com.interview.navanee.comparatorTwo;

public class Employee implements Comparable<Employee>
{
	private String name;
	private int experience;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}	
	public Employee(String name, int experience) 
	{		
		this.name = name;
		this.experience = experience;
	}
	@Override
	public int compareTo(Employee b) {
		
		return this.experience - b.getExperience();
	}
	
	public String toString()
	{
		return "Employee name : "+this.name+"\nEmployee Experience : "+this.experience+"\n\n";
	}
}
