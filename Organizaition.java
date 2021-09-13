package com.sattibabu.corejava;


public class Organizaition {

	public static void main(String args[]){
		
		
		Employee emp=new Employee();
		
		emp.empId="101";
		emp.empName="Satti babu";
		emp.department="IT";
		
		String result=emp.saveEmployeeDetails(emp);
		
		System.out.println(result);
		
		
		
		
		
	}
	
	
}
