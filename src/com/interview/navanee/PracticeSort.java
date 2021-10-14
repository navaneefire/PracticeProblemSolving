package com.interview.navanee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeSort 
{
	public static void main(String []args)
	{
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("navanee");
		arrayList.add("jai");
		arrayList.add("sudha");
		arrayList.add("subburaj");
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}
}
