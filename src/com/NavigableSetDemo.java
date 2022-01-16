package com;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		t.add(3000);
		t.add(5000);
		t.add(2000);
		t.add(7000);
		t.add(1000);
		System.out.println(t);
		
		System.out.println(t.ceiling(2000));
		System.out.println(t.descendingSet());
		

	}

}
