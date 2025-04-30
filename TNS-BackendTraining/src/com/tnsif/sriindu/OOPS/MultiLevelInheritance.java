package com.tnsif.sriindu.OOPS;

public class MultiLevelInheritance {
		public void parentmsg() {
			System.out.println("Iam parent");
		}
}

class MlChild1 extends MultiLevelInheritance{
	public void child1() {
		System.out.println("Iam child one.");
	}
}
class MlChild2 extends MlChild1{
	public void child2() {
		System.out.println("Iam grand child.");
	}
}
