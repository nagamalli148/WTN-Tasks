package com.wipro.arrays;
import java.util.Arrays;
public class Assignment5 {
	
public static void main(String[] args) {
	
	int array[]= {1,2,3,4,5,0,22};
		Arrays.sort(array);
		System.out.println("The Min of those two are "  + array[0]   +   "and"   +   array[1]);
		System.out.println("The Max of those two are " + array[array.length-1]   +  "and"  +  array[array.length-2]);

		 	
	}
}
