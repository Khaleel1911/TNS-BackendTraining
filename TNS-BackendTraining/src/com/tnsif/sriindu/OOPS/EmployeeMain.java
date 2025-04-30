package com.tnsif.sriindu.OOPS;

//Encapsulation Exmaple
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		
		obj.setEid(1001);
		obj.setSalary(50000);
		
		Employee obj2=new Employee();
		
		obj2.setEid(1002);
		obj2.setSalary(58000);
		
		System.out.println(obj.getEid()+" "+obj.getSalary());
		System.out.println(obj2.getEid()+" "+obj2.getSalary());
		
		

	}

}
