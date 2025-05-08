package com.tnsif.sriindu.ExceptionHandling;

public class TryWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Iam try block");
			return;
		}finally {
			System.out.println("Iam finally block");
		}

	}

}
