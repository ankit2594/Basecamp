package Maker;

public class Prepare {

	public static void main(String[] args) 
	{
		System.out.println(getIntegerComplement(10));

	}
	 static int getIntegerComplement(int n) 
	    {
	       String k="";
	        while(n>0)
	        {
	            k=k+n%2;
	            n=n/2;
	        }
	        String l="";
	        for(int i=k.length()-1;i>=0;i--)
	        {
	            l=l+k.charAt(i);
	        }
	        System.out.println(l);
	        k=l;
	        String p="";
	        for(int i=0;i<k.length();i++)
	        {
	           if(k.charAt(i)=='0')
	           {
	               p=p+'1';
	           }
	            else 
	            {
	                p=p+'0';
	            }
	        }
	        System.out.println(p);
	        int temp=Integer.parseInt(p);
	        System.out.println(temp);
	        int count=0;
	        int sum=0;
	        while(temp>0)
	        {
	           sum+=temp%10*Math.pow(2,count);
	            count++;
	            temp=temp/10;
	        }
	        System.out.println(sum);
	        return sum;
	    }


}
