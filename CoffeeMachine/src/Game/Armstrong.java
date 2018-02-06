package Game;

public class Armstrong {

	public static void main(String[] args) 
	{
      int n=153;
      int n2=n;
      int sum=0;
      while(n>0)
      {
    	  sum+=Math.pow(n%10, 3);
    	  n/=10;
      }
      if(n2==sum)
      {
    	  System.out.println("Armstrong");
      }  
      else
      {
    	  System.out.println("not armstrong");
      }

	}

}
