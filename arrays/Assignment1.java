package com.wipro.arrays;

public class Assignment1 {
	public static void main(String[] args) {
	int[] array={1,2,3,4};
	double sum=0;
	double avg;
	for(int i=0;i<array.length;i++) {
		sum+=array[i];
	}
	
	avg=sum/array.length;
	System.out.println("sum is " + sum);
	System.out.print("Average :" +avg);	
	}
  }
