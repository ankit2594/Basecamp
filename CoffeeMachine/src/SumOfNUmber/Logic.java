package SumOfNUmber;
import java.util.*;

public class Logic 
{
    static int numberOfPairs(int[] a, long k) 
    {
    	 int count=0;
     	int temp=0;
     	for(int i=0;i<a.length;i++)
     	{
     		for(int j=i+1;j<a.length;j++)
     		{
     			if(a[i]==a[j]&&a[i]+a[j]==k)
     			{
     				count++;
     				temp=1;
     				break;
     			}
     			if(temp==1)
     				break;
     		}
     	}
     	System.out.println(count);
        Set s=new TreeSet();
        for(int n:a)
        {
     	   s.add(n);
        }
        int [] arr=new int[s.size()];
        int m=0;
        for(Object n:s)
        {
     	  arr[m]=(int)n;
     	  m++;
        }
          for(int i=0;i<arr.length;i++)
        {
            int se=(int)(k-arr[i]);
              if(se==arr[i])
              {
                  break;
              }
            int lb=0, ub=arr.length-1;
            int mb=ub/2;
            while(lb<=ub)
            {
                if(se==arr[mb])
                {
                	//System.out.println(arr[mb]);
                    count++;
                    break;
                }
                else if(se>arr[mb])
                    lb=mb+1;
                else
                    ub=mb-1;
                mb=(lb+ub)/2;
            }
        }
       return count;
    
    }

}
