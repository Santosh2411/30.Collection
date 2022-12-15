package com.san;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println("Is Empty::"+v.isEmpty());
		v.add("a");
		v.add("b");
		v.add("c");
		v.add(5);
		v.add(6);
		v.add(null);
		v.add(null);
		System.out.println("Elements::"+v.size());
		System.out.println("Elements::"+v);
		System.out.println("3rd Index object::"+v.get(3));
		
		

	}

}
