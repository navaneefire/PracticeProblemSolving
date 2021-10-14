package com.interview.navanee.comparatorTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TestingMap 
{
	public static void main(String []args)
	{
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		treeMap.put("navanee",23);
		treeMap.put("jai",20);		
		treeMap.put("sulochana", 46);
		treeMap.put("subburaj",54);
		treeMap.put("samyNaicker", 54);
		SortedMap<String,Integer> subMap = treeMap.subMap("jai", "navanee");		
		SortedMap<String,Integer> headMap = treeMap.headMap("subburaj");
		SortedMap<String,Integer> tailMap = treeMap.tailMap("subburaj");
		SortedMap<String,Integer> descendingMap = treeMap.descendingMap();
		Set<String> ketSet = descendingMap.keySet();
		System.out.println(treeMap);
		System.out.println(subMap);
		System.out.println(headMap);
		System.out.println(tailMap);
		System.out.println(descendingMap);
		System.out.println(ketSet);
		System.out.println(treeMap.keySet());
		System.out.println(treeMap.values());
		System.out.println(new ArrayList<Integer>().size());
	}
}
