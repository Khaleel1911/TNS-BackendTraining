package com.tnsif.sriindu.UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class User {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter name:");
//		String name=sc.nextLine();
//		System.out.println("Enter age:");
//		int age=sc.nextInt();
//		
//		System.out.println("Name: "+name+" Age: "+age);
//		
//		sc.close();
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name:");
		String name=br.readLine();
		System.out.println("Enter age:");
		int age=br.read();
		
		System.out.println("Name: "+name+" Age: "+age);
		
			

	}

}
