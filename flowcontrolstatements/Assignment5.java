package com.wipro.flowcontrolstatements;

public class Assignment5 {
	public static void main(String args[]){
		char x= 'a';
		
		if((x>=65 && x<=90)||(x>=97 && x<=122)){
			
			System.out.println("Alphabet");
		
		}
		
		else if(x>=48 && x<=57){
			
			System.out.println("Digit"); 
		}
		else
		{
			System.out.println("Special character");
		}
	}

}
