package Game;

import java.util.*;

public class Duplicates 
{
public static void main(String[] args) 
{
	int [] arr={2,5,6,7,2,7,4,9,4};
	Arrays.sort(arr);
	ArrayList a= new ArrayList();
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]!=arr[i+1])
		{
			a.add(arr[i]);
		}
	}
	if(arr[arr.length-1]!=arr[arr.length-2])
	{
		a.add(arr[arr.length-1]);
	}
	int [] brr=new int[a.size()];
	for(int i=0;i<a.size();i++)
	{
		brr[i]=(int)a.get(i);
	}
	for(int n:brr)
	{
		System.out.print(n+" ");
	}
}
}
