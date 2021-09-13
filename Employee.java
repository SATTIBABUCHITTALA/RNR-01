package com.sattibabu.corejava;

public class Employee {

	String empName;

	String empId;

	String phoneNumber;

	String emailId;

	String department;


	String empPosition;


	double salary;


	int workingHours;


	int getLeaveBalance(String empId){

		//claculation
		int leaveBalance = 0;
		System.out.println(" Leave Balance");
		return leaveBalance;


		}

		void  getEmployeeDetails(String empId){
			
	System.out.println(" Get Details Methos is being called");

		}
		
		String saveEmployeeDetails(Employee employee){
			
			return "Saved Successfully!" ;
			
			
			//logic to save into DB;
			
			
		}
	
}
