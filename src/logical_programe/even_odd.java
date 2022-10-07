package logical_programe;

import java.util.Scanner;

public class even_odd 
{
	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		//to take input
		System.out.println("enter number");
		 int num1=scan.nextInt();
		 if(num1%2==0)
		 {
			 System.out.println("given no. is even number");
		 }
		 else
		 {
			 System.out.println("given no.is not even no.");
		 }
	}

}
