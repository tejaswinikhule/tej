package logical_programe;

public class reverse_num 
{
	public static void main(String[] args) 
	{
		 
		
			
			int s1=123;
			int reverse=0;
			    //123     123>0      123/10= 12.3           //for not accepting decimal no. so it will take only 12
			             //12>0        15/10=1.5
			              //1>0
			for(int i=s1;   i>0;      i=i/10)
			{
				 int rem=i%10;        //123%10   ->rem =3              //12%10=2        //1%10=1
				 reverse=reverse*10+rem; //3
				   
				 
				 
			}
			System.out.println(reverse);  //321
		}
		
	}


