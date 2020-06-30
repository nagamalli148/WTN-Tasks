package com.wipro.strings;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Tomcat";
		int len=str.length();
		 
		if(len%2==0) {
			System.out.println(str.substring(0,len/2));
		}
		else
		{
			System.out.println("null");
		}
	}

}

