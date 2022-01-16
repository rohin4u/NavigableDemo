package com.com;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add(40);
		l.add(20);
		l.add(60);
		l.add(10);
		l.add(50);
		l.add(80);
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
		
		System.out.println(Collections.binarySearch(l, 100));
		
		
		
		

	}

}
