package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_IC 
{
	
	public static void main(String[]args) 
	{
	    TreeSet ts=new TreeSet();
	    
	   ts.add(100);
	   ts.add(500);
	   ts.add(300);
	   ts.add(600);
	   ts.add(200);
	   ts.add(200);    //duplicates are not allowed
	  // ts.add(null);   //null values are not allowed....>it gives exception in console
	    
	    System.out.println(ts);
	    
	    //to find size
	    System.out.println(ts.size());         //05
	    
	    //to chech object is empty or not
	    System.out.println(ts.isEmpty());      //false
	    
	    //to verify information is present or not
	    System.out.println(ts.contains(600));    //true
	    System.out.println(ts.contains(1000));   //false
	    
	    //remoove information
	    ts.remove(100);
	    System.out.println(ts);
	    
	    //to remove first information
	    ts.pollFirst();
	    System.out.println(ts);
	    
	    //to remove last information
	    ts.pollLast();
	    System.out.println(ts);
	    
	    //to print first information
	    System.out.println(ts.first());
	    
	    //to print last information
	    System.out.println(ts.last());
	    
	    
	    System.out.println("-------------------for each loop--------------");
		
		   //to fetch all data from "ts" object by using "for each loop"
		    for(Object aa:ts) 
		    {
		    	System.out.println(aa);
		    }
		    
		    
		    System.out.println("----------------iterator curser....>while loop-----------------------");
			   //to fetch all data from "ts" object by using "Iterator curser....>while loop"
			    Iterator bb=ts.iterator();
			    while(bb.hasNext()) 
			    {
			    	System.out.println(bb.next());
			    }
		
		
	    
	    
	
	 
	}
}
