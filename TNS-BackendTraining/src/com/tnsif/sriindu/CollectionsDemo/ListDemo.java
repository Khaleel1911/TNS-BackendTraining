package com.tnsif.sriindu.CollectionsDemo;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> mylist=new ArrayList<>();
		
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		mylist.add(50);
		
		System.out.println("Size of List is:"+mylist.size());
		
		System.out.println("Is mylist empty:"+mylist.isEmpty());
		
		System.out.println("mylist contains 10:"+mylist.contains(15));
		
		Iterator<Integer> i = mylist.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		Object [] obj= mylist.toArray();
		for(Object item:obj) {
			System.out.println(item);
		}
		
		mylist.add(2005);
		
		mylist.remove(2);
			
		List<Integer> mylist2=new ArrayList<>();
		mylist2.add(30);
		mylist.retainAll(mylist2);
		System.out.println(mylist2);
		
		
		mylist.clear();
		System.out.println("after clearing the list the list contains:"+mylist.size());
		
		mylist.add(2005);
		System.out.println("Element at index 0 is:"+mylist.get(0));	

	}

}
