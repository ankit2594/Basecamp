package Fraction;

public class Main 
{

	public static void main(String[] args) 
	{
		String s="722/148+360/176";
		String []arr=new String[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]="";
		}
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='/'||s.charAt(i)=='+')
			{
				count++;
			}
			else
			{
				
				arr[count]+=s.charAt(i);
				
			}
		}
		int a=Integer.parseInt(arr[0]);
		int b=Integer.parseInt(arr[1]);
		int c=Integer.parseInt(arr[2]);
		int d=Integer.parseInt(arr[3]);
		long num=(a*d)+(c*b);
		long den=b*d;
		long sml=0;
		if(num<den)
			sml=num;
		else
			sml=den;
		for(long i=sml/2;i>=2;i--)
		{
			if(num%i==0&&den%i==0)
			{
				num/=i;
				den/=i;
			}
		}
		String k=num+"/"+den;
		System.out.println(k);
String g="23";

	}

}
