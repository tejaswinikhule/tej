package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist1 
{
	public static void main(String[] args)
	{
		 ArrayList a1=new ArrayList();
		 //to add information
		 a1.add("teju");
		 a1.add(100);
		 a1.add('a');
		 a1.add(90.8f);
		 a1.add(null);
		 a1.add(500);
		 a1.add("sona");
		 System.out.println("arraylist");
		 System.out.println(a1);
		 
		 //to verify the arraylist is empty or not
		 System.out.println("to verify the arraylist is empty or not");
		 System.out.println(a1.isEmpty());
		 
		 //to get size of arraylist
		 System.out.println("/to get size of arraylist");
		 System.out.println(a1.size());
		 
		 //to verify the info is present or not
		 System.out.println("/to verify the info is present or not");
		 System.out.println(a1.contains(500));
		 
		 //add info in arraylist -- right shift operation is done here
		 System.out.println("add info in arraylist");
		 a1.add(0,200);
		 System.out.println(a1);
		 
		 // to remove index--- left shifting is done here
System.out.println("to remove index 0");
		 System.out.println(a1.remove(0));
		 
		 //update information use set 
		 System.out.println("update information ");
		 a1.set(4, 80.67f);
		 System.out.println(a1);
		 
		 //to find the index of data
		 System.out.println("to find the index of data by passing the data");
		 System.out.println(a1.indexOf("teju"));
		 
		 //to get the data by providing index
		 System.out.println("to get the data by providing index");
		 System.out.println(a1.get(0));
		 
		System.out.println("----------ArrayList by using iterator curser------------");
	     Iterator itr= a1.iterator ();
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	     System.out.println("----------ArrayList by using Listiterator curser------------");
	     ListIterator ltr= a1.listIterator ();
	     while(ltr.hasNext())
	     {
	    	 System.out.println(ltr.next());
	     }
	     
	     System.out.println("---------ArrayList by using for each loop---------");
	     for(Object li:a1)
	     {
	    	 System.out.println(li);
	     }
	}

}
