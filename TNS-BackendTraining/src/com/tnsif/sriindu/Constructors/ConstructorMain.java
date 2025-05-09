package com.tnsif.sriindu.Constructors;

public class ConstructorMain {
		public static void main(String[] args) {
			Constructor con1=new Constructor();
			System.out.println("Name:"+con1.name+"  Age:"+con1.age);
			Constructor con2=new Constructor("Khaleel",20);
			System.out.println("Name:"+con2.name+"  Age:"+con2.age);
			Constructor con3=new Constructor(con2);
			System.out.println("Name:"+con3.name+"  Age:"+con3.age);			
		}
}
