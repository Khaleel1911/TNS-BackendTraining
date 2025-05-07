package com.tnsif.sriindu.InterfaceDemo;

public class BankImp implements Bank{
	
	int balance=2000;
	@Override
	public void deposit(int amount) {
		if(amount>0 && amount<DEPOSIT_LIMIT) {
			
			balance+=amount;
			System.out.println("The balance after Deposit is:"+balance);
		}else {
			System.err.println("Invalid amount");
		}
		
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
			if(amount<0 && amount<balance) {
			
			balance-=amount;
			System.out.println("The balance after withdraw is:"+balance);
		}else {
			System.err.println("Invalid Transaction");
		}
		
	}
		
}
