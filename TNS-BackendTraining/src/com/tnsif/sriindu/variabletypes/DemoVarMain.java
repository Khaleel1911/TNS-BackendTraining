package com.tnsif.sriindu.variabletypes;

public class DemoVarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoTypesVar ob= new DemoTypesVar();
		ob.numone=23;
		ob.number=34;
		
		int result=ob.numone=10;
		
		System.out.println("This is instance variable output"+result);
		ob.display();
		
		System.out.println("This is static variable output"+DemoTypesVar.numthree);
		 
	}

}
