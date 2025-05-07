package com.tnsif.sririndu.Constructors;

public class Constructor {
		String name;
		int age;
		
		Constructor(){
			System.out.println("Iam default Constructor");
		}
		
		Constructor(String name,int age){
			this.name=name;
			this.age=age;
			System.out.println("Iam parameterized constructor.I have initiaglized name and age");
			
		}
		
		Constructor(Constructor obj){
			this.name=obj.name;
			this.age=obj.age;
			
			System.out.println("Iam copy cosntructor");
		}
}
