package com.wipro.flowcontrolstatements;

public class Q1a {
public static void main(String[] args)
{
	int a=Integer.parseInt(args[0]);
	if(a>0) {
		System.out.print("Given Integer is Positive");
	}
	else if(a<0)
	{
		System.out.print("Given Integer is negative");
	}
	else
	{
		System.out.print("Given Integer is zero");
	}
}
}
