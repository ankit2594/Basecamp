package StringSimilarity;

public class Logic 
{
	 static int[] stringSimilarity(String[] inputs) 
	    {
	        int []arr= new int[inputs.length];
	       for(int i=0;i<inputs.length;i++)
	       {
	           int sum=0;
	           for(int j=0;j<inputs[i].length();j++)
	           {
	               String l=inputs[i].substring(j,inputs[i].length());
	               for(int k=0;k<l.length();k++)
	               {
	                   if(l.charAt(k)!=inputs[i].charAt(k))
	                   {
	                      break;
	                     
	                   }
	                   sum++;
	               }
	           }
	           arr[i]=sum;
	       }
	        return arr;
	    }
}
