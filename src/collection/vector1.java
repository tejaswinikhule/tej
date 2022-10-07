package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		// add data in vector 
		v1.add("tejaswini");
		v1.add('m');
		v1.add(89);
		v1.add(null);
		v1.add(2.56f);
		v1.add(200);
		v1.add(null);
		v1.add(200);
		
		//to print vector
		System.out.println(v1);
		
		//to verify vectorr is empty or not
		System.out.println(v1.isEmpty());
		
		//to get size
		System.out.println(v1.size());
		
		// to check any information contains or not
		System.out.println(v1.contains(200));
		
		//to get data by passing index
		
		System.out.println(v1.get(2));
		
		//to get index
		
		System.out.println(v1.indexOf("tejaswini"));
		
		//to add data in vector --> right shift operation
		v1.add(0,300);
	    System.out.println(v1);
	    
	    //to remove data
	   System.out.println( v1.remove(0));
	   
	   //to update the data
	   v1.set(0, "khule");
	   System.out.println(v1);
	   
	   System.out.println("=============print vector using iterator curser===============");
	 Iterator itr= v1.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    System.out.println("=============print vector using Listiterator curser===============");
		 ListIterator ltr= v1.listIterator();
		    while(ltr.hasNext())
		    {
		    	System.out.println(ltr.next());
		    }
		    System.out.println("=============print vector using Enumeration curser===============");
		    Enumeration enu= v1.elements();
		    while(enu.hasMoreElements())
		    {
		    	System.out.println(enu.nextElement());
		    }
			   	    
		    
	}
	

}
