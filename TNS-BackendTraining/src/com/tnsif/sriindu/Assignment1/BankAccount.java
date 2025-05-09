package com.tnsif.sriindu.Assignment1;

public class BankAccount {
		int ACCOUNT_NUMBER=102141;
		int BALANCE=0;
		
		int limit=50000;
		
		public void deposit(int amount) {
			try {
			    if (amount > 0 && amount <= limit) {
			        BALANCE += amount;
			        System.out.println("Deposited Successfully");
			        System.out.println("Your Account Balannce After Deposit is: " + BALANCE);
			    } else {
			        throw new InvalidAmountException("Invalid deposit amount.Amount should be less than"+limit);
			    }
			} catch (InvalidAmountException e) {
			    System.out.println(e.getMessage());
			}

			
		}
		public void withdraw(int amount) {
			
			
			try {
			    if (amount <= BALANCE && amount > 0) {
			    	BALANCE-=amount;
					System.out.println("Amount withdrawn Succesfully");
					System.out.println("Your Account Balance After Withdrawl is:"+ BALANCE);
					
			    } else {
			        throw new InsufficientFundsException("Insufficient funds");
			    }
			} catch (InsufficientFundsException e) {
			    System.out.println(e.getMessage());
			}
			
		}
		public void display() {
			System.out.println("Your Account Balance is:"+ BALANCE);
		}
}
