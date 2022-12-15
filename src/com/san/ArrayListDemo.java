package com.san;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			Object obj=list.get(i);
			String str=(String) obj;
			System.out.println(str.toLowerCase());
		}
		System.out.println();
		System.out.println(list);
	}

}
