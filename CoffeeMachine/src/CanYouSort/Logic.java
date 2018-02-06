package CanYouSort;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Logic 
{
    static void customSort(int[] arr) 
    {
    	int count=0;
		Arrays.sort(arr);
		Set s=new TreeSet();
		for(int i=0;i<arr.length;i++)
		{
           s.add(arr[i]);
		}
		int p=0;
		int []c=new int[s.size()];
	    int []d=new int[s.size()];
		Iterator itr=s.iterator();
	 while(itr.hasNext())
	 {
		int h=(int)itr.next();
	    for(int i=0;i<arr.length;i++)
		{		 
			if(h==arr[i])
			{
				count++;
			}
			
		}
	    c[p]=h;
	    d[p]=count;
	    count=0;
	    p++;
      }
	 for(int i=0; i<d.length-1;i++)
	 {
		 for(int j=0;j<d.length-1;j++)
		 {
			 if(d[j]>d[j+1])
			 {
				 int temp=d[j];
				 d[j]=d[j+1];
				 d[j+1]=temp;
				 temp=c[j];
				 c[j]=c[j+1];
				 c[j+1]=temp;
			 }
		 }
	 }
	 for(int i=0;i<c.length;i++)
	 {
		for(int j=1;j<=d[i];j++)
		{
			System.out.println(c[i]);
		}
	 }
	 

    }


}
