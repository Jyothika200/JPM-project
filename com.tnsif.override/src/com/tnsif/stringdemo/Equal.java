package com.tnsif.stringdemo;
//to demonstrate equals operator

public class Equal {
	public static void main(String[] args) {
		String s1="sachin";
		String s2="sachin"; //both refer to same instance
		String s3=new String("sachin"); //s3 refers to instance created in non pool
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}

}
