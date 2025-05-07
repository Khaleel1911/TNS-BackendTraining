package com.tnsif.sriindu.Arrays;

public class OneDArray {
		public void printArray() {
			int arr[]= {1,2,3,4,5};
			
			System.out.println("Array printing using for loop");
			for(int i=0;i<5;i++) {
				System.out.print(arr[i]+" ");
			}
			
			System.out.println("Array printing using for each loop");
			for(int element:arr) {
				
				System.out.print(element+" ");
			}
			
		}
		
		
		
}
