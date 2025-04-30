package com.tnsif.sriindu.OOPS;

public class SingleInheritance {
		public void printMsgOfParent() {
			System.out.println("Iam parent class");
		}
}

class SiChild extends SingleInheritance{
	public void printMsgOfChild() {
		System.out.println("Iam child class representing single inheritance");
	}
}
