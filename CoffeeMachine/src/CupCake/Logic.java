package CupCake;

public class Logic 
{
	 static void maximumCupcakes(String[] trips) 
	    {
	      for(int i=0;i<trips.length;i++)
	      {
	          String[] arr=trips[i].split(" ");
	          int n=Integer.parseInt(arr[0]);
	          int c=Integer.parseInt(arr[1]);
	          int m=Integer.parseInt(arr[2]);
	       
	        int paid=n/c;
	        int extra=paid/m;
	        int rem=0;
	        if(extra!=0)
	        rem=paid%m;
	        int last=(extra+rem)/m;
	        int total=paid+extra+rem;
	        System.out.println(total);
	      }
	      
	    }
}
