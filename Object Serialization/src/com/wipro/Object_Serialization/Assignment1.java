/*Create a class called Employee with properties name(String),dateOfBirth(java.util.Date),
 * department(String),designation(String) and Salary(double).Create respective getter and
 * setter methods and constructors (no-argument constructor and parameterized constructor)
 * for the same.Create an object of the Employee class and save this object in a file called
 * "data" using serialization.Later using deserialization read this object and
   print the properties of this object.*/

package com.wipro.Object_Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


import com.wipro.Object_Serialization.bean.Employee;

public class Assignment1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.setName(sc.nextLine());
		System.out.print("Enter D.O.B.: ");
		emp.setDob(sc.nextLine());
		System.out.print("Enter department: ");
		emp.setDepartment(sc.nextLine());
		System.out.print("Enter designation: ");
		emp.setDesignation(sc.nextLine());
		System.out.print("Enter salary: ");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream("OutObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("OutObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDob());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		sc.close();
	}
	

}