package Capabilities;
import java.util.Arrays;
import java.util.Comparator;

public class LengthSorting
{
	public static void main(String[] args)
	{
	String s="my name is ankit";
	String [] arr=s.split(" ");
	Arrays.sort(arr, new Arrange());
	for(String x:arr)
	{
		System.out.println(x+" ");
	}
	}
}
	class Arrange implements Comparator
	{
    	@Override
		public int compare(Object x, Object y)
		{
			int l1=((String) x).length();
			int l2=((String)y).length();
			if(l1==l2)
			{
				return(((String)x).compareTo((String) y));
				
			}
			return l1-l2;
		}
		
		
	}

