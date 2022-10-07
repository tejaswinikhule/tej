package logical_programe;

public class Reverse_sentencces 
{
	public static void main(String[] args) 
	{
		String org= "i am playing";
		System.out.println("original string  -> " + org);
		String s1=reverseString(org);
		System.out.println("reverse string  ->  "  +s1);
		
	}
public static String reverseString(String Sentence)
   {
	String [] text=Sentence.split(" ");
	
	String rev =" ";
      for(int i=text.length-1;   i>=0;  i--)
      {
    	  rev=rev+text[i]+" ";
      }
	return rev;
	}
	
	

}
