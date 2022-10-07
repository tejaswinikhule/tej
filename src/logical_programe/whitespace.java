package logical_programe;

public class whitespace
{
	public static void main(String[] args) 
	{
	String s1="ab c d ";
	int count=0;
	for(int  i=0;  i<=s1.length()-1;     i++)
	{
		char charvalue =s1.charAt(i);
	
	if(  charvalue==' ')
	{
		count++;
		
	}
	}
	System.out.println(count);

}
}