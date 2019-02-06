/**
 * This class defines Address 
 */
package com.ncu.assignment;
public class Address {

	private String line1;
	private String line2;
	private String city;
	private String state;
	private int pinCode;
	
	public Address(String line1,String line2,String city,String state,int pinCode)
	{
		this.line1=line1;
		this.line2=line2;
		this.city=city;
		this.state=state;
		this.pinCode=pinCode;
	}

	public void display() {
		System.out.println(line1+"\n"+line2+"\n"+city+"\n"+state+"\n"+pinCode);
	}
}




public class Student {

	String firstName;
	String lastName;
	Address addr;
		
	public Student(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	
		
	}
	
	public Student (String firstName,String lastName,Address addr)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.addr=addr;
		
	}
	public void display()
	{
		System.out.println("Student Details");
        System.out.println("Name::"+firstName+" "+lastName);
        System.out.print("Address::");
        addr.display();
        
	}
}