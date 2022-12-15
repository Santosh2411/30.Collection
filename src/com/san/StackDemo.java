package com.san;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	
		Stack s=new Stack();
		System.out.println("Is Empty::"+s.isEmpty());
		s.push("A");
		s.push("B");
		s.push("C");
		s.push(1);
		s.push(2);
		s.push(null);
		s.push(null);
		s.push("D");
		s.push("E");
		s.push("F");
	
		System.out.println(s.size());
		System.out.println(s.capacity());
		System.out.println(s);
		System.out.println("=============================================");
		s.push("G");
		System.out.println(s.size());
		System.out.println(s.capacity());
		System.out.println(s);
		System.out.println("=============================================");
       //Retrieving and remove object from top
		System.out.println("2nd index object::"+s.get(2));
		System.out.println("Remove top item::"+s.pop());
		System.out.println(s.size());
		System.out.println(s.capacity());
		System.out.println("After Removing top item::"+s);
		//only retrieving the top item....
		System.out.println("only retrieving the top item::"+s.peek());
		//Searching item
		System.out.println("Search item 'B' ::"+s.search("B"));
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println("After pop::"+s);
		System.out.println(s.peek());
		System.out.println("After peek::"+s);

		
	}

}
