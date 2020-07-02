/*Given a String and an integer n,print a new string made
 * of n repeitions of the last n characters of the string.
 * you may assume that n is between 0 and length of the
 * string,inclusive*/

package com.wipro.strings;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,c="";
		int b,len;
		b=Integer.parseInt(args[1]);
		len=args[0].length();
		a=args[0];
		len=len-b;
		for(int i=0;i<b;i++) {
			c=c+a.substring(len);
		}
		System.out.println(c);
	}

}
