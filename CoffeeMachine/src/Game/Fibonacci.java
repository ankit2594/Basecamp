package Game;

public class Fibonacci {

	public static void main(String[] args) 
	{
	  int a=0;
	  int b=1;
	  System.out.print(a+" ");
	  System.out.print(b+" ");
	  for(int i=2;i<=1000;i++)
	  {
		  int sum=a+b;
		  
		  System.out.print(sum+" ");
		  
		  a=b;
		  b=sum;
		  
	  }

	}

}
