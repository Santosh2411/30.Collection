package com.san;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		System.out.println(list.isEmpty());
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(5);
		list.add(6);
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println("Size:"+list.size());
		System.out.println("Elements:"+list);
		System.out.println("3rd index object::"+list.get(3));

	}

}
