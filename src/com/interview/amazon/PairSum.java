package com.interview.amazon;

import java.util.HashSet;

public class PairSum 
{
	static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];
            if (s.contains(temp)) 
            {
                System.out.println("Pair with given sum "+ sum + " is (" + arr[i]+ ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }
 
    
    public static void main(String[] args)
    {
        int A[] = { 1,15, 14, 6, 10, 2 };
        int n = 16;
        printpairs(A, n);
    }
}
