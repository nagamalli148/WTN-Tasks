package com.wipro.arrays;

public class Assignment11 {
	public static void main(String[] args) {
		int[] array={1,4,1,4};
		int len=array.length;
		int j=0;
		for(int i=0;i<array.length;i++) 
		{
		
			if(array[i]== 4 || array[i]==1)
			{
			    j++;
			}
		}
		if(j==len) {
			System.out.println("true");
		}
		
		else
			
		{
			System.out.println("false");
		}
  }
}
	