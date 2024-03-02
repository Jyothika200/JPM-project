package com.tnsif.collections;
//to demonstrate the autoboxing

public class Autoboxingg {
	public static void main(String[] args) {
		int a=20;
		Integer i=Integer.valueOf(a);  //converting int into Integer explicitly
		Integer j=a; //autoboxing,now compiler will write Integer value(a) internally
		System.out.println(a +" "+i+" "+j);
		
		
	}

}
