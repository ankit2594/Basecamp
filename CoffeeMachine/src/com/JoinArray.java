package com;

import java.util.*;

public class JoinArray {

	public static void main(String[] args) {
    int[] a1={-5,10,100,6,8};
    int[] a2={2,9,6,10,3};
	int[] a3={10,9,-5};
	int [] arr=duplicate(a1,a2,a3);
	for(int n:arr)
	{
		if(n!=0)
		System.out.print(n+" ");
	}

	}
	static int[] duplicate(int [] a1, int [] a2, int [] a3)
	{
		int []arr=new int [a1.length+a2.length+a3.length];
		int temp=0;
		for(int i=0;i<a1.length;i++)
		{
		   arr[temp]=a1[i];
		   temp++;
		}
		for(int i=0;i<a2.length;i++)
		{
		   arr[temp]=a2[i];
		   temp++;
		}
		for(int i=0;i<a3.length;i++)
		{
		   arr[temp]=a3[i];
		   temp++;
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
			   if(arr[j]>arr[j+1])
			   {
				   int r=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=r;
			   }
			}
		}
		int count=0;
		int [] brr=new int [10];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				brr[i]=arr[i];
				i++;
			}
		}
		int b=0;
		for(int i=0;i<brr.length;i++)
		{
			if(brr[i]==0)
			{
				b++;
			}
		}
		if(b==brr.length)
			return null;
		else
        return brr;
	}

}
