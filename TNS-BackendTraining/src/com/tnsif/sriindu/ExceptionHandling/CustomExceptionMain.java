package com.tnsif.sriindu.ExceptionHandling;

public class CustomExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new CustomException("Hi Iam new Exception");
		}catch(CustomException e) {
			System.out.println(e);	
		}

	}

}
