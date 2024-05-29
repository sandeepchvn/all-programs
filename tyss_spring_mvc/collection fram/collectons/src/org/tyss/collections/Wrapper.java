package org.tyss.collections;

public class Wrapper {
	public static void main(String[] args) {
		String s="100";//converting binary to integer
		int a=Integer.parseInt(s, 2);//pass string and binary value
		System.out.println(a);// you will get integer value
		
		String s1="e3c";
		int r=Integer.parseInt(s1, 16);//Converting hexadecimal
		System.out.println(r);
		
	}
}
