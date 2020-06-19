package com.wipro.flowcontrolstatements;

public class Assignment15 {
public static void main(String[] args) {
	if(args.length==0) {
	System.out.println("please enter an integer number");
	System.exit(0);
	}
	int rowcount=Integer.parseInt(args[0]);
	
	for(int i=1;i<=rowcount;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" * ");
		}
		System.out.println("\n");
	}
	}
}