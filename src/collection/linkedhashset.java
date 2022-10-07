package collection;


import java.util.Iterator;
import java.util.LinkedHashSet;


public class linkedhashset 
{
	public static void main(String[] args) 
	{
LinkedHashSet  lhs1 =new LinkedHashSet();
		
		lhs1.add("vina");
		lhs1.add(100);
		lhs1.add('h');
		lhs1.add('h');//duplicate
		lhs1.add("hina");
		lhs1.add(400.09f);
		lhs1.add(null);
		lhs1.add(null);
		System.out.println(lhs1);
		System.out.println(lhs1.size());
		System.out.println(lhs1.isEmpty());
		System.out.println(lhs1.contains(100));
		lhs1.remove(100);
		System.out.println(lhs1);
		System.out.println("iterator curser");
		Iterator itr=lhs1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("for esch loop");
		for(Object s1:lhs1)
		{
			System.out.println(s1);
		}
		
		
		
		
	

		
	}

}
