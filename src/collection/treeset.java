package collection;
import java.util.Iterator;
import java.util.TreeSet;

public class treeset 
{
	public static void main(String[] args)
	{
      TreeSet tr=new TreeSet();
      	
		tr.add(400);
		tr.add(100);
		tr.add(566);
		tr.add(700);
		tr.add(600);
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		System.out.println(tr.contains(100));
		tr.remove(100);
		System.out.println(tr);
		  // to remove 1st info from ascending order
		tr.pollFirst();
		System.out.println(tr);
		
		 // to remove last info from ascending order
		tr.pollLast();
		System.out.println (tr);
		//to print 1st info 
		System.out.println(tr.first());
		//to print info last
		System.out.println(tr.last());
		
		System.out.println("iterator curser");
		Iterator itr=tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("for esch loop");
		for(Object s1:tr)
		{
			System.out.println(s1);
		}
		
				
	}

}

		
	
