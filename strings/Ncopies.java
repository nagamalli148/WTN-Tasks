package com.wipro.strings;

public class Ncopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Wipro";
		int len=str.length();
		String repeater ="";
		if(len<2) repeater=str;
		
		else repeater = str.substring(0,2);
		
	   String copies ="";
	   for(int i=0;i<len;i++) {
		   
		   copies+=repeater;
	   }
	   System.out.println(copies);
		
	}

}
