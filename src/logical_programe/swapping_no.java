package logical_programe;

public class swapping_no 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		 System.out.println(a);
		 System.out.println(b);
	
		 a=a+b;
		 b=a-b;      //1st way
		 a=a-b;
		 System.out.println(a);
		 System.out.println(b);
		 
		 int swap;
		 swap=a;
		 a=b;
		 b=swap;                //2nd way
		 
		 System.out.println(a);
		System.out.println(b);
	}
}
