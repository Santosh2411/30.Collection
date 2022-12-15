package com.san;

public class NITCollectionTest {

	private Object[] objeArray=new Object[10];
	
	private int index=0;
	
	public void add(Object ele)
	{
		if(size()==capacity())
		{
			incrementCapacity();
		}
		objeArray[index]=ele;
		index++;
	}
	
	public int size()
	{
		return index;
	}
	public int capacity()
	{
		return objeArray.length;
	}
	private void incrementCapacity()
	{
		Object[] tempArray=new Object[capacity()*2];
		for(int i=0;i<objeArray.length;i++)
		{
			tempArray[i]=objeArray[i];
			
		}
		objeArray=tempArray;
	}
	
	public Object get(int i)
	{
		return objeArray[i];
	}
	
	public void replace(int i,Object ele)
	{
		objeArray[i]=ele;
	}
	
	public void remove(int i)
	{
		for(;i<size()-1;i++)
		{
			objeArray[i]=objeArray[i+1];
			
		}
		objeArray[i]=null;
		index--;
	}
	
	public void insert(int i,Object ele)
	{
		if(size()==capacity())
		{
			incrementCapacity();
		}
		for(int j=size()-1;j>=i;j--)
		{
			objeArray[j+1]=objeArray[j];
		}
		objeArray[i]=ele;
		index++;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<size();i++)
		{
			sb.append(objeArray[i]);
			sb.append(",");
		}
		int start=sb.lastIndexOf(",");
		if(start!=-1)
		{
			sb.delete(start, start+2);
		}
		sb.append("]");
		return sb.toString();
	}
	public static void main(String[] args) {
	
		NITCollectionTest col=new NITCollectionTest();
		System.out.println("Capacity:"+col.capacity());
		System.out.println("Size:"+col.size());
		System.out.println("Elements:"+col);
		System.out.println("-------------------------------------------------------------------------------------------------");
		col.add("a");
		col.add("b");
		col.add("c");
		col.add("d");
		col.add("e");
		col.add(6);
		col.add(7);
		col.add(8);
		col.add(9);
		col.add(10);
		System.out.println("Capacity:"+col.capacity());
		System.out.println("Size:"+col.size());
        System.out.println("Elements:"+col);	
        System.out.println("---------------------------------------------------------------------------------");
       col.add(11);
       System.out.println("Capacity:"+col.capacity());
	   System.out.println("Size:"+col.size());
       System.out.println("Elements:"+col);
       System.out.println("--------------------------------------------------------------------------------------");
       //Retrieving third index from collection
       Object obj=col.get(2);
       System.out.println("\n 2nd index element:"+obj);
       System.out.println("----------------------------------------------------------------------------------------");
       //inserting new element at 4th index
       col.insert(4,true);
       System.out.println("\n The Element true is inserted");
       System.out.println("Capacity:"+col.capacity());
	   System.out.println("Size:"+col.size());
       System.out.println("Elements:"+col);
       System.out.println("----------------------------------------------------------------------------------------");
      col.remove(0);
      System.out.println("\n The 0 index is removed");
      System.out.println("Capacity:"+col.capacity());
	  System.out.println("Size:"+col.size());
      System.out.println("Elements:"+col);
      System.out.println("----------------------------------------------------------------------------------------");
      col.replace(5, 6.9);
      System.out.println("The 5th index obj is replaced");
      System.out.println("Capacity:"+col.capacity());
	  System.out.println("Size:"+col.size());
      System.out.println("Elements:"+col);
      System.out.println("----------------------------------------------------------------------------------------");

	}

}
