//A012upXz
//convert L to U and viceversa without any digits aUPxZ

package com.wipro.strings;
public class Conversionquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hi HeLlo WElComE";
		String str1="";
        int len=str.length();
        for(int i=0;i<len;i++) {
        	char ch=str.charAt(i);
		if(Character.isUpperCase(ch))
			str1+=Character.toLowerCase(ch);
		else
			str1+=Character.toUpperCase(ch);
			
		}
        System.out.println(str1);
	}

}