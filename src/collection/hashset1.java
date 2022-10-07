package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1
{
	public static void main(String[] args) 
	{
		HashSet hs1 =new HashSet();
		
		hs1.add("vina");
		hs1.add(100);
		hs1.add('h');
		hs1.add("hina");
		hs1.add(400.09f);
		hs1.add(null);
		hs1.add(null);
		System.out.println(hs1);
		System.out.println(hs1.size());
		System.out.println(hs1.isEmpty());
		System.out.println(hs1.contains(100));
		hs1.remove(100);
		System.out.println(hs1);
		System.out.println("iterator curser");
		Iterator itr=hs1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("for esch loop");
		for(Object s1:hs1)
		{
			System.out.println(s1);
		}
		
		
		
		
	}

}
