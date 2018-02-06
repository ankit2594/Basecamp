package com;

public class Main {

	public static void main(String[] args)
	{
	  String s1="Ankit Gupta";
	  String s2="Mohit Kumar";
	  String[]s=make(s1, s2);
	  for(String k: s)
	  {
		  System.out.println(k);
	  }
	  

	}
	static String[] make(String s1, String s2)
	{
		String [] arr=new String [2];
		int i1=s1.lastIndexOf(' ');
		int i2=s2.lastIndexOf(' ');
		arr[0]=s1.substring(0,i1)+s2.substring(i2, s2.length());
		arr[1]=s2.substring(0,i2)+s1.substring(i1, s1.length());
		return arr;
		
	}

}
