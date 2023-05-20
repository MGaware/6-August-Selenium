package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_IC 
{
	
	public static void main(String[] args) 
	{
		ArrayList m1=new ArrayList();
		
		m1.add("mahesh");
		m1.add("suhas");
		m1.add("mahesh");
		m1.add(215);
		m1.add(145);
		m1.add('a');
		m1.add(45.45);
		m1.add('a');
		m1.add(null);
		m1.add(null);
		
		System.out.println(m1);
		
		//verify m1 is empty or not
		System.out.println(m1.isEmpty());
		
		//to find size/capacity
		System.out.println(m1.size());
		
		//verify information is present or not
		System.out.println(m1.contains(145));  //true
		System.out.println(m1.contains(44));   //false
		
		//add information inbetween arraylist....>right shift operation
		    m1.add(4, 1455);
		
		    System.out.println(m1);
		
	    //remove information...>left shift operation 
		    m1.remove(4);
		    System.out.println(m1);
		
		//update information
		    m1.set(0, "gaware");
		    System.out.println(m1);
		    
		//to find index of data
		   System.out.println(m1.indexOf("gaware"));
		   
	    //to get information by providing index
		   System.out.println(m1.get(5));
		   
		   System.out.println("-------------for each loop-----------------------------------");
		   
		//to fetch all data from m1 object by using "for each loop"
		   for(Object s1:m1) 
		   {
			   System.out.println(s1);
			   
		   }
		   
		   System.out.println("---------------Iterator curser...>while lopp--------------------");
		   
	    //to fetch all data from m1 object by using "Iterator curser....>while loop"
		   Iterator a1=m1.iterator();
		   
		   while(a1.hasNext())
		   {
			   System.out.println(a1.next());
		   }
		   
		   System.out.println("---------------------ListIterator--------------------");
		   
		   //to fetch all data from m1 object by using "ListIterator curser....>while loop"
		  ListIterator aa=m1.listIterator();
		
		  while(aa.hasNext()) 
		  {
			  System.out.println(aa.next());
		  }
		
		
		
		
	}

}
