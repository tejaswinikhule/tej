package logical_programe;

import java.util.Arrays;

public class array_compare 
{
	public static void main(String[] args)
	{
		int ar1[]= {10,20,30};
		int ar2[]= {40,50,60};
		int ar3[]= {40,50,60};
		System.out.println(Arrays.equals(ar1, ar2));
        System.out.println(Arrays.equals(ar2, ar3));
		
	}

}
