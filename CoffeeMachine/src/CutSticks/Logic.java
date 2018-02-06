package CutSticks;

import java.util.ArrayList;

public class Logic 
{
    static int[] cutSticks(int[] lengths) 
    {
     ArrayList a=new ArrayList();
     while(true)
     {
     int small=1000;
 	 int temp=0;
 	 int count=0;
     for(int i=0;i<lengths.length;i++)
     {
    	 if(lengths[i]<small&&lengths[i]!=0)
    	 {
    		 small=lengths[i];
    	 }
     }
     for(int i=0;i<lengths.length;i++)
     {
    	 if(lengths[i]!=0)
    	 {
    	 lengths[i]=lengths[i]-small;
    	 temp++;
    	 }
     }
     a.add(temp);
     temp=0;
     for(int i=0;i<lengths.length;i++)
     {
    	 if(lengths[i]==0)
    	 {
    		 count++;
    	 }
     }
     if(count==lengths.length)
     {
    	 break;
     }
    }
     int [] arr=new int [a.size()];
     for(int i=0;i<a.size();i++)
     {
    	 arr[i]=(int)a.get(i);
     }
     return arr;
    }

}
