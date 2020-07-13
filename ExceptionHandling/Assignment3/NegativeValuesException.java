package com.wipro.ExceptionHandlingAssignment6;

public class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		super();
		System.out.println("NegativeValuesException occured");
	}
}