package india;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		
		Collections.sort(l, new MyComparator());
		
		System.out.println(l);
		
		System.out.println(Collections.binarySearch(l, 10, new MyComparator()));
		
		Collections.reverse(l);
		System.out.println(l);
		
		int[] i = {45, 78,54,34,21,98};
		
		Arrays.sort(i);
		
		for(int i1 : i) {
			System.out.println(i1);
		}
		
		List asList = Arrays.asList(i);
		System.out.println(asList);
		
		

	}

}
