package logical_programe;

public class pallindrome 
{
	public static void main(String[] args) 
	{
		String s1="madam";
		String s2="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	

    if(s1.equals(s2))                           // .equals method  is case sensitive so if capital letter is there then it will give false
    {
    	System.out.println(" pallindrome");
    }
    else
    {
    	System.out.println(" not pallindrome");
    }

}
}

