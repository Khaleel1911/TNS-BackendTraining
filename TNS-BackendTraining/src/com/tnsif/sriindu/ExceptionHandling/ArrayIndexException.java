package com.tnsif.sriindu.ExceptionHandling;

public class ArrayIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		try {
			int arr[]=new int[5];
			
//			System.out.println(arr[4]);
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot acces the element.It is not present");
		}finally {
			System.out.println("Program completed");
		}

	}

}
