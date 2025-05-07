package com.tnsif.sriindu.Arrays;

public class TwoDArray {
	public void printArray() {
		int arr[][]= {{1,2,3,4,5},{6,7,8,9,10}};
		
		System.out.println("Array printing using for loop");
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++)
			System.out.print(arr[i][j]+" ");
			
			System.out.println();
		}
		
		System.out.println("Array printing using for each loop");
		for(int[] element:arr) {
			
			for(int ele:element) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		
	}
}
