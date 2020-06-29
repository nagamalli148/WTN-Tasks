package com.wipro.strings;

public class Stringconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hi HeLlo WElComE";
		//Read from a system
		//system.in -keyboard
		//Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		//String str=sc.next();
		
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
