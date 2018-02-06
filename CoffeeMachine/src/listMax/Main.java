package listMax;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the size of array");
		long len=kb.nextInt();
		long [] arr=new long[(int)len+1];
		System.out.println("Enter the no. of inputs");
		long inputs=kb.nextInt();
        //long lrg=0;
        //long lrgIndex=0;
		for(long i=1;i<=inputs;i++)
		{
			System.out.println("Enter the first range");
			long n1=kb.nextInt();
			System.out.println("Enter the second range");
			long n2=kb.nextInt();
			System.out.println("Enter the sum");
			long k=kb.nextInt();
            arr[(int)(n1-1)]+=k;
            arr[(int)n2]-=k;
		}
        long sum=0;
        for(long i=0;i<arr.length;i++)
        {
            if((arr[(int)i]>0))
            sum+=arr[(int)i];
        }        
               System.out.println(sum);
	}

}
