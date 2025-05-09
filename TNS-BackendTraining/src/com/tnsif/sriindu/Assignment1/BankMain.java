package com.tnsif.sriindu.Assignment1;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		BankAccount obj=new BankAccount();
		System.out.print("-------------Welcome to TNS Bank----------------\n");
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Depost\n"+"2.Withdraw\n"+"3.Balance Check\n"+"4.Exit\n");
			
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1: {
				System.out.println("Enter amount to be Deposited: ");
				sc.hasNextLine();
				int amount=sc.nextInt();
				obj.deposit(amount);
				break;
			}
			case 2: {
				System.out.println("Enter amount to be Withdrawn: ");
				sc.hasNextLine();
				int amount=sc.nextInt();
				obj.withdraw(amount);
				break;
			}
			case 3:{
				obj.display();
				break;
			}
			case 4:{
				System.out.println("Good Bye...:)");
				choice=4;
				break;
			}
			default:{
				System.out.println("Invalid Choice....!");
			}
			}
		}while(choice!=4);

	}

}
