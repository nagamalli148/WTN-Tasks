package com.wipro.strings;

public class Assignment7 {
	public static void main(String[] args) {
		String str = "xHellox";

		if(str.charAt(0)=='x') {
			
		 str=str.substring(1,str.length());
		}
		if(str.charAt(str.length()-1)=='x')
			str=str.substring(0,str.length()-1);
		
		System.out.println(str);
	}
}
