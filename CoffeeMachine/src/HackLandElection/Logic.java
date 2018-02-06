package HackLandElection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;
public class Logic 
{
	 static String electionWinner(String[] votes) 
	 {
		int count=0;
		Arrays.sort(votes);
		Set s=new TreeSet();
		for(int i=0;i<votes.length;i++)
		{
           s.add(votes[i]);
		}
	    Map m=new TreeMap();
		Iterator itr=s.iterator();
	 while(itr.hasNext())
	 {
		String h=(String)itr.next();
	    for(int i=0;i<votes.length;i++)
		{		 
			if(h.equals(votes[i]))
			{
				count++;
			}
			
		}
	    m.put(count, h);
	    count=0;
      }
	   Set k=m.keySet();
	   int lrg=0;
	   for(Object key:k)
	   {
		  if((int)key>lrg)
		  {
			lrg=(int)key;  
		  }
	   }
	   return (String)m.get(lrg);
}
}
