package com.tnsif.collections;
import java.util.ArrayList;
import java.util.Iterator;
//to demonstrate the arraylist using generics

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("banana");
		System.out.println(list);
		//Travesing list through iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) { //check if iterator has a element
			System.out.println(itr.next()); //printing the element and movenext
		
		}
	}

}
