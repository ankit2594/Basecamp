package Game;

public class Palindrom {

	public static void main(String[] args) 
	{
      String s="naman";
      String k="";
      for(int i=s.length()-1;i>=0;i--)
      {
    	 k+=s.charAt(i); 
      }
      if(k.equals(s))
      {
    	  System.out.println("palindrom");
      }
      else
      {
    	  System.out.println("not palindrom");
      }
	}

}
