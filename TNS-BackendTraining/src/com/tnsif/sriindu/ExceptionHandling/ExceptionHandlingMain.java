package com.tnsif.sriindu.ExceptionHandling;

public class ExceptionHandlingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=10/0;
			
		}catch(ArithmeticException e) {
			System.out.println("A number can't be divided with zero");
		}catch(Exception e) {
			System.out.println("Unknown Error occured");
		}

	}

}
