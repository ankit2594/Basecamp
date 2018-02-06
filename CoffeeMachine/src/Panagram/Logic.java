package Panagram;

public class Logic
{
	 static String isPangram(String[] strings) 
	    {
		 char ch='a';
	        String k="";
	        int count=0;
	        for(int i=0;i<strings.length;i++)
	        {
	        	strings[i]=strings[i].replace(" ","");
	            while(strings[i].length()>0)
	            {
	                int l=strings[i].length();
	                strings[i]=strings[i].replace(ch+"","");
	                if(l-strings[i].length()>0)
	                {
	                    count++;
	                }
	                ch++;
	                
	            }
	            if(count>=26)
	            {
	               k+=1; 
	            }
	            else
	            {
	                k+=0;
	            }
	            count=0;
	        }
	        return k;
 
	    }


}