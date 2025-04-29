package com.tnsif.sriindu.variabletypes;

public class VariablesDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VarablesTypes obj=new VarablesTypes();
		VarablesTypes obj2=new VarablesTypes();
		
		obj.instancevar=10;
		System.out.println("Iam instance variable: "+obj.instancevar);
		obj.display();
		obj2.instancevar=10;
		System.out.println("Iam instance variable: "+obj2.instancevar);
		obj2.display();
//		System.out.println("Iam static variable: "+obj.statvar); static var using object
		
		System.out.println("Iam static using calss name: "+VarablesTypes.statvar);  //static var using class name

	}

}
