package Capabilities;

public class QuickSort {

	public static void main(String[] args) 
	{
	  int [] arr= {7,4,6,3,7,1,2,9,4};
	  quickSort(arr,0,arr.length-1);
	  for(int n:arr)
	  {
		  System.out.print(n+" ");
	  }

	}
	static void quickSort(int [] arr, int start, int end)
	{
		if(start<end)
		{
		int index=partition(arr,start,end);
		quickSort(arr,start,index-1);
		quickSort(arr,index+1,end);
		}
	}
	static int partition(int [] arr,int start, int end)
	{
		int pivot=arr[end];
		int pIndex=start;
		for(int i=start;i<end;i++)
		{
			if(arr[i]<=pivot)
			{
				int temp=arr[i];
				arr[i]=arr[pIndex];
				arr[pIndex]=temp;
				pIndex++;
			}
		}
		int temp=arr[end];
		arr[end]=arr[pIndex];
		arr[pIndex]=temp;
		return pIndex;
	}
	

}
