package com.wipro.strings;

public class Practice {
	public static void main(String[] args) {
	String p="hi how are you";
	String a=p.substring(0,2);
	System.out.println(a);
	String b=p.substring(p.length()-2);
	System.out.println(a.equals(b));
	
	//split
	//if you want to divide the line into words/strings
	//string arra-return type
	
	String h[]=p.split(" ");
	System.out.println(h[3]);
	System.out.println(h[1].concat("Welcome"));
	
	//conversion
	int i=50;
	//String d=String.valueOf(i);  // 1.Any PDT into a string
	//String d=i+""; //2nd way
	String d=Integer.toString(i);
	System.out.println(d);
	
	String d1="50";
	//int a1=Integer.parseInt(d);
	//System.out.println(a1);
	char b1=d1.charAt(0);
	char a2[]=p.toCharArray();
	System.out.println(a2);
	System.out.println(a2[0]);
	System.out.println(b1);
	String ll="";
	for(int j=0;j<a2.length;j++)
		ll=ll+String.valueOf(a2[j]);
	
	 String l1=new String(a2); 
	
	}

}