package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset_IC 
{
	
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(100);
		lhs.add('A');
		lhs.add("mahesh");
		lhs.add(12.45);
		lhs.add(100);         //duplicates are not allowed
		lhs.add(null);
		lhs.add(null);        //only one null value allowed
		
		System.out.println(lhs);
		
		//to find size
		System.out.println(lhs.size());
		
		//to verify object is empty or not
		System.out.println(lhs.isEmpty());
		
		//verify information is present or not
		System.out.println(lhs.contains(100));
		System.out.println(lhs.contains(154855));
		
		//to remove
		lhs.remove(100);
		System.out.println(lhs);
		
		
		   System.out.println("-------------------for each loop--------------");
			
		   //to fetch all data from "lhs" object by using "for each loop"
		    for(Object aa:lhs) 
		    {
		    	System.out.println(aa);
		    }
		    
		    
		    System.out.println("----------------iterator curser....>while loop-----------------------");
			   //to fetch all data from "lhs" object by using "Iterator curser....>while loop"
			    Iterator bb=lhs.iterator();
			    while(bb.hasNext()) 
			    {
			    	System.out.println(bb.next());
			    }
		
		
		
		
		
	
	
	
	}
}
