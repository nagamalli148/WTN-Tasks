package com.wipro.strings;

public class Stringbuffer {
public static void main(String[] args) {
	//Stringbuffer.StringBuilder
	//thread safe(synch),not thread safe(not sync)
	//Mutable
	//thread 1 a++,thread 2 a--
	//The output of the StringBuffer obj will be always a StringBuffer
	
	StringBuffer sb=new StringBuffer("hi");
	//append
	sb.append("Welcome");
	//System.out.println(sb);
 //index
	sb.insert(1,"hello"); //inserting a string into another string
	//System.out.println(sb);
	//replace
	sb.replace(0, 3, "hi");
	System.out.println(sb);
	
 //delete
	
	sb.delete(1, 3);
	System.out.println(sb);
	
	//reversing a string 
	
    String l2="";
    
	String p="hi how are you";
	for(int i=p.length()-1;i>=0;i--) {
		l2=l2+p.charAt(i)+"";
		//String l=p.charAt(i)+"";
	}
	System.out.println(l2);
	
	//Reversing a string using method
	StringBuffer ss=new StringBuffer(p);
	ss.reverse();
	String s1=ss+"";
	System.out.println(ss);

	String s="Hi HelLo PlEase";
	//convert the lowercase characters into uppercase and viceversa
	
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		
	}
	
}

