package com.wipro.flowcontrolstatements;

public class Assignment6 {
	public static void main(String[] args){
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		
	if(!gender.equals("Male") && !gender.equals("Female")){
	    System.out.println("Invalid gender");
	   }
	if(gender.equals("Female") && (age>=1 || age<=58)){
		
		System.out.println("Intrest is 8.2%");
	}
	else if(gender.equals("Female") && (age>=59 || age<=100)){
			
			System.out.println("Intrest is 9.2%");
		}
	else if(gender.equals("Male") && (age>=1 || age<=58)){
		
		System.out.println("Intrest is 8.4%");
	}
   else if(gender.equals("Male") && (age>=59 || age<=100)){
		
		System.out.println("Intrest is 10.5%");
	}
   else{
	   System.out.println("No Intrest");
   }
}	   
}