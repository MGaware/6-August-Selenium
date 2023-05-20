package Logical_Program;

import java.util.HashMap;
import java.util.Set;

public class Occurence_of_each_character_using_hashmap 
{
	
	public static void main(String[] args) 
	{
		String org="mahesh kalyan gaware";
		
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		
		
		for(int a=0; a<=org.length()-1; a++) 
		{
			char charvalue=org.charAt(a);
			
		
		
		if(hash.containsKey(charvalue)) 
		{
			
			hash.put(charvalue, hash.get(charvalue)+1);
		}
		else 
		{
			
			hash.put(charvalue, 1);
			
		}
		}
		
	Set<Character> keys=hash.keySet();
	
	for(Character key:keys) 
	{
		System.out.println(key+";"+hash.get(key));
		
	}
		
		
		
	}

}
