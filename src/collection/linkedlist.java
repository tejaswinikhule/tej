package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist 
{
public static void main(String[] args) 
{
	LinkedList l1=new LinkedList();
	
	l1.add("kiran");
	l1.add(400);
	l1.add('j');
	l1.add(null);
	l1.add(400);
	l1.add(null);
	
	System.out.println(l1);
	
	System.out.println("is empty or no not");
	System.out.println(l1.isEmpty());
	
	System.out.println("size of linked list");
	System.out.println(l1.size());
	
	System.out.println("the info contain or not");
	System.out.println(l1.contains(400));
	
	System.out.println("add info");
	l1.add(4, 500);
	System.out.println(l1);
	
	System.out.println("remove info");
	System.out.println(l1.remove());
	
	System.out.println("update info");
	l1.set(2, 100);
	System.out.println(l1);
	
	System.out.println("get  index");
	System.out.println(l1.indexOf("kiran"));
	
	System.out.println("get data");
	System.out.println(l1.get(1));
	
	System.out.println("====print linkes list using itertor curser====");
	Iterator itr=l1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}
	System.out.println("=====print linkesd list by using listiterator====");
   ListIterator ltr =	l1.listIterator();
   while(ltr.hasNext())
   {
	   System.out.println(ltr.next());
   }
	
}


}
