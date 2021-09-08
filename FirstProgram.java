package com.sattibabu.corejava;


class VariableDec{
	
	int i;
	static String name="Satti Babu";
	
	
	
	void func(int num){
		int k;
		
		System.out.println("K value "+num);
	}
	
	
	
}





public class FirstProgram {

	public static void main(String args[]){
		
		
		
		//classname objectname=new classname();
		VariableDec dec=new VariableDec();
		
		dec.i=10;
		VariableDec.name="Satya";
		System.out.println("Instance Variable "+ dec.i +"  " + VariableDec.name);
		
		
		VariableDec dec1=new VariableDec();
		System.out.println("Instance Variable "+ dec1.i +"  " + VariableDec.name);
		
		
		
		dec.func(10);
		
		
		
		
	}
	
	
	
	
}

