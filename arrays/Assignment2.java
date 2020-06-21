package com.wipro.arrays;

public class Assignment2 {
public static void main(String[] args) {
	int array[]= {1,2,3,4,5,0,22};
	int min=array[0];
	int max=array[0];
	
	for(int i=0;i<array.length;i++) {
		
				if(array[i]<min) 
			       min = array[i];
		
		        if(array[i]>max)
			        max=array[i];
	}
		    System.out.println("Maximum is " +min);
			System.out.println("Minimum is "+ max);
		}
	}

