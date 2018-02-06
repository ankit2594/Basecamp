package MagicalVowel;

public class Logic 
{
	static int longestSubsequence(String s) 
	{
      int[] arr=new int [5];
      for(int i=0;i<s.length();i++)
      {
    	  if(s.charAt(i)=='a')
    	  {
    		  arr[0]++;
    	  }
    	  else if(s.charAt(i)=='e')
    	  {
    		  if(arr[0]>arr[1])
    		  {
    			  arr[1]=arr[0]+1;
    		  }
    		  else
    		  {
    			  arr[1]++;
    		  }
    	  }
    	  else if(s.charAt(i)=='i')
    	  {
    		  if(arr[1]>arr[2])
    		  {
    			  arr[2]=arr[1]+1;
    		  }
    		  else
    		  {
    			  arr[2]++;
    		  }
    	  }
    	  else if(s.charAt(i)=='o')
    	  {
    		  if(arr[2]>arr[3])
    		  {
    			  arr[3]=arr[2]+1;
    		  }
    		  else
    		  {
    			  arr[3]++;
    		  }
    	  }
    	  else if(s.charAt(i)=='u')
    	  {
    		  if(arr[3]>arr[4])
    		  {
    			  arr[4]=arr[3]+1;
    		  }
    		  else
    		  {
    			  arr[4]++;
    		  }
    	  }
      }

      return arr[4];
	  
	}

}
