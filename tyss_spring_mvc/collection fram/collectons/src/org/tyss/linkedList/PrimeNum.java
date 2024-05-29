package org.tyss.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrimeNum {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
//		long start=System.nanoTime();
		for (int i = 0; i < 10; i++) {
			if (isPrime(i))
				li.add(i);
		}
//		long end=System.nanoTime();
//		long start2=System.nanoTime();
		for (int prime : li) {
			System.out.println(prime);
		}
//		long end2=System.nanoTime();
//		ArrayList<Integer> arr= new ArrayList<Integer>();
//		long start1=System.nanoTime();
//		for (int i = 0; i < 10; i++) {
//			if (isPrime(i))
//				arr.add(i);
//		}
//		long end1=System.nanoTime();
//		long start3=System.nanoTime();
//		for (int prime : li) {
//			System.out.println(prime);
//		}
//		long end3=System.nanoTime();
//		System.out.println("time taken to add prime numbers by LinkedList->"+(end-start));
//		System.out.println("time taken to add prime numbers by ArrayList->"+(end1-start1));
//		System.out.println("time taken to fetch prime numbers by LinkedList->"+(end3-start3));
//		System.out.println("time taken to fetch prime numbers by LinkedList->"+(end2-start2));
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	
}
