package com.sattibabu.corejava;

public class ConditionalStatementDemo {

	public static void main(String args[]){
		
		
		//ctrl+shift+/
		/*if(citizenShip == "US"){
			
			System.out.println("US Citizen "+ citizenShip);
			
		}else if(citizenShip=="Indian"){
			
			System.out.println("Indian Citizen "+ citizenShip);
			
		}else{
			
			System.out.println("Other");
		}*/
		
		String citizenShip="US";
		switch(citizenShip){
		
		
		case "US" :
			System.out.println("US Citizen: "+citizenShip);
			break;
		case "Indian":
			System.out.println("Indian Citizen: "+ citizenShip);
			break;
		case "Japan":
			System.out.println("Japan");
			break;
		default:
			System.out.println("Other");
		
		
		
		}
		
	}
	
	
}
