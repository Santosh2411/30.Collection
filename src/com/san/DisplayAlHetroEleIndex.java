package com.san;

import java.util.ArrayList;

public class DisplayAlHetroEleIndex {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList<>();
		list.add("Sanosh");
		list.add(900000.00);
		list.add("Pramod");
		list.add(1000000.00);
		list.add("Nivas");
		list.add(2000000.00);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			Object ele=list.get(i);
					if(ele instanceof String)
					{
						String name=(String) ele;
						System.out.println(name.toUpperCase());
						
					}
					else
					{
						System.out.println(ele);
					}
		}
		
	}

}
