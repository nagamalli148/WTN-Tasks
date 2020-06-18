package com.wipro.flowcontrolstatements;

public class Q1b {
public boolean lastDigit(int a,int b) {
	int digit1=a%10;
	int digit2=b%10;
	if(digit1==digit2)
		return true;
	else
		return false;
	
}
}