package com.wipro.arrays;

public class Assignment3 {
public static void main(String[] args) {
	int[] array= {1,2,3,4,5};
	int j=5;
	int index=-1;
	
	//int j=Integer.parseInt(args[0]);
	
	for(int i=0;i<array.length;i++) { 
		 
		if(array[i]==j) {
			
			 index=i+1;
			 break;
			 
		}
	}
			System.out.println(index);
	
    }
}