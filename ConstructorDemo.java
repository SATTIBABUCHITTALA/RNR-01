package com.sattibabu.corejava;

class Student{
	
	String stdId;
	String principalName;
	String stdName;
	char grade;
	String phoneNumber;
	String emailId;
	String address;
	int stdMarks;
	
	int squareOfNumber(int num){
		return num*num;
	}
	
	Student getStudentDetails(String studentId){
		return new Student();
	}
	Student(){
		System.out.println("Constructor will be called");
	}
	Student(String name){
		principalName=name;
	}
	Student(int marks){
		stdMarks=marks;
		System.out.println("Marks of the Student is "+ marks);
		
	}
	
}

public class ConstructorDemo {
	public static void main(String args[]){
		

		Student std=new Student();
		std.getStudentDetails("101");
		
		Student std1=new Student("Satya");
		System.out.println(std1.principalName);
		
		
		Student std2=new Student(70);
		
		
		int result=std.squareOfNumber(67);
		
		System.out.println(result);
		
		
		
	}

}
