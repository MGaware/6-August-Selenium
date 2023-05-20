package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_IC 
{
	public static void main(String[] args) 
	{
		LinkedList ltr=new LinkedList();
		
		ltr.add(100);
		ltr.add("mahesh");
		ltr.add("gaware");
		ltr.add('A');
		ltr.add(100);
		ltr.add(700);
		ltr.add("gaware");
		ltr.add(null);
		ltr.add(null);
		ltr.add(56.45);
		
		System.out.println(ltr);
		
	
	
	   //verify "ltr" is empty or not
		System.out.println(ltr.isEmpty());
	
	   //to find size/capacity
		System.out.println(ltr.size());
	
	   //verify information is present or not
		System.out.println(ltr.contains(100));
	
	   //add information inbetween arraylist....>right shift operation
		ltr.add(2, "mahi");
		System.out.println(ltr);
	
	   //remove information...>left shift operation 
		ltr.remove(2);
		System.out.println(ltr);
	
	   //update information
		ltr.set(0, 2000);
		System.out.println(ltr);
	
	   //to find index of data
	    System.out.println(ltr.indexOf(2000));
	  
	    //to get information by providing index
	    System.out.println(ltr.get(5));
	    
	    System.out.println("-------------------for each loop--------------");
	
	   //to fetch all data from "ltr" object by using "for each loop"
	    for(Object aa:ltr) 
	    {
	    	System.out.println(aa);
	    }
	  
	    System.out.println("----------------iterator curser....>while loop-----------------------");
	   //to fetch all data from "ltr" object by using "Iterator curser....>while loop"
	    Iterator bb=ltr.iterator();
	    while(bb.hasNext()) 
	    {
	    	System.out.println(bb.next());
	    }
	    
	    
	   System.out.println("-------------------------Listiterator curser....>while loop-----------------------");
	   //to fetch all data from "ltr" object by using "ListIterator curser....>while loop"
	    ListIterator c1=ltr.listIterator();
	    while(c1.hasNext()) 
	    {
	    	System.out.println(c1.next());
	    }
	
	}
}
