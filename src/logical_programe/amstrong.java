package logical_programe;

public class amstrong 
{
	public static void main(String[] args) 
	{
		
		int s1=153;
		int sum=0;
		    //153     153>0      153/10= 15.3           //for not accepting decimal no. so it will take only 15
		             //15>0        15/10=1.5
		              //1>0
		for(int i=s1;   i>0;      i=i/10)
		{
			 int rem=i%10;        //153%10   ->rem =3              //15%10=5         //1%10=1
			 sum=sum+(rem*rem*rem);            //27=0+ ( 3*3*3)    //125=0+( 5*5*5)   //1=0+ ( 1*1*1)
			   
			 
			 
		}
		if(s1==sum)
		{
			System.out.println("no. is amstrong");
		}
		else
		{
			System.out.println("no.is not amstrong");
		}
		
	}

}
