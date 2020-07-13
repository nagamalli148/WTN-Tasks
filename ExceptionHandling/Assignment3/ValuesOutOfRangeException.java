package com.wipro.ExceptionHandlingAssignment6;

public class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException() {
		super();
		System.out.println("ValuesOutOfRangeException occured");
	}
}