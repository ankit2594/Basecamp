package UniqueArray;

import java.util.*;

public class Logic 
{
	static int getMinimumUniqueSum(int[] arr) 
    {
		Arrays.sort(arr);
		int lrg=arr[arr.length-1];
		int sum=0;
		for(int i=0;i<arr.length-1;i++)
		{
			sum+=arr[i];
			if(arr[i]==arr[i+1])
			{
				for(int j=arr[i]+1;j<=lrg+1;j++)
				{
			        int temp=0;
				 	for(int k=0;k<arr.length;k++)
				 	{
				 		if(j==arr[k])
				 		{
				 			temp=1;
				 			break;
				 		}
				 		
				 	}
				 	if(temp==0)
				 	{
				 		arr[i+1]=j;
				 		break;
				 	}
				}
			}
			
		}
		sum+=arr[arr.length-1];
		return sum;
        
    }

}
