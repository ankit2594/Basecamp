package SharingCandy;

import java.util.ArrayList;

public class Logic 
{
	   static long getCandies(long n, long p) 
	   {
		   int count=0;
	       ArrayList a =new ArrayList();
	      for (int i=1; i<=Math.sqrt(n); i++)
	      {
	        if (n%i==0)
	        {
	            if (n/i == i)
	            {
	               a.add(n/i);
	            }
	            else
	            {
	              count++;
	              if(count==p)
	              {
	                return i;
	              }
	                a.add(n/i);
	            }
	        }

	      }
	          for(int i=0;i<a.size();i++)
	          {
	              long temp=(Long)a.get(a.size()-1);
	              count++;
	              if(count==p)
	              {
	                  return temp;
	              }
	              
	          }
	       return 0;
		   
		   
//	       int count=0;
//	       for(int i=1;i<=n/2;i++)
//	       {
//	           if(n%i==0)
//	           {
//	              count++; 
//	              System.out.println(count);
//	               if(count==p)
//	               {
//	                   return i;
//	               }
//	           }
//	       }
//	       return 0;

	   }
}
