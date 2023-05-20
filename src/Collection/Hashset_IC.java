package Collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashset_IC 
{
	
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		
		hs.add(1452);
		hs.add("mahesh");
		hs.add(100);          //duplicates are not allowed
		hs.add('A');
		hs.add(70.45);
		hs.add(100);
		hs.add("mahesh");     //duplicates are not allowed
		hs.add(null); 
		hs.add(null);         //only one "null" value allowed
		
		System.out.println(hs);
		
		
		//to find size
		System.out.println(hs.size());
		
		//to find object is empty or not
		System.out.println(hs.isEmpty());
		
		//to verify information present or not
		System.out.println(hs.contains(1452));
		
		//remove info
		hs.remove('A');
		System.out.println(hs);
		
		   System.out.println("-------------------for each loop--------------");
			
		   //to fetch all data from "hs" object by using "for each loop"
		    for(Object aa:hs) 
		    {
		    	System.out.println(aa);
		    }
		    
		    
		    System.out.println("----------------iterator curser....>while loop-----------------------");
			   //to fetch all data from "hs" object by using "Iterator curser....>while loop"
			    Iterator bb=hs.iterator();
			    while(bb.hasNext()) 
			    {
			    	System.out.println(bb.next());
			    }
		
		
		
		
		
		
	}

}
