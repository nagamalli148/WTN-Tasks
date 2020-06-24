package com.wipro.arrays;

public class Assignment9 {
	//public static void main(String[] args) {
		public int[] withoutTen(int[] nums) {
			
		int[] array=new int[nums.length];
		int counter=0;
	    for(int i=0;i<nums.length;i++) {
	    	if(nums[i]!=10)
	    		array[counter++]=nums[i];
	    }
	    return array;
	}
	
}
