package com.wipro.flowcontrolstatements;

public class Assignment16 {
public static void main(String[] args) {
	int reversenum=0;
	int num=Integer.parseInt(args[0]);
	int remainder;
	
	
	
	while(num!=0) {
		remainder=num%10;
		reversenum=reversenum*10+remainder;
		num=num/10;
	}
	System.out.println(reversenum);
}

}
