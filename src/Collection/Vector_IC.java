package Collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Vector_IC 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		
		v1.add(1000);
		v1.add("mahesh");
		v1.add("gaware");
		v1.add('A');
		v1.add('A');
		v1.add(45.45);
		v1.add(12569);
		v1.add('A');
		
		System.out.println(v1);
		
		//verify V1 is empty or not
		System.out.println(v1.isEmpty());   //false
		
		//to find size/capacity
		System.out.println(v1.size());
		
		//verify information is present or not
		System.out.println(v1.contains('A'));
		
		//add information inbetween vector....>right shift operation
		v1.add(3, 2000);
		System.out.println(v1);
		
	    //remove information...>left shift operation 
		v1.remove(5);
		System.out.println(v1);
		
		//update information
		v1.set(1, "mahi");
		System.out.println(v1);
		
		//to find index of data
		System.out.println(v1.indexOf(1000));
		
	    //to get information by providing index
		System.out.println(v1.get(6));
		
		
		System.out.println("----------------for each loop------------------------");
		//to fetch all data from v1 object by using "for each loop"
		for(Object s1:v1) 
		{
			System.out.println(s1);
		}
		
		
		System.out.println("--------------------------iterator...>while loop-----------------------");
	    //to fetch all data from v1 object by using "Iterator curser....>while loop"
		java.util.Iterator itr=v1.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("-------------------------------listiterator...>while loop-------------------------");
	    //to fetch all data from v1 object by using "ListIterator curser....>while loop"
		ListIterator s2=v1.listIterator();
		while(s2.hasNext()) 
		{
			System.out.println(s2.next());
		}
		
		
		System.out.println("----------------Enumeration curser....>while loop-----------------------");
		//to fetch all data from v1 object by using "Enumeration curser....>while loop"
		Enumeration bb=v1.elements();
		while(bb.hasMoreElements()) 
		{
			System.out.println(bb.nextElement());
		}
		
	}

}
