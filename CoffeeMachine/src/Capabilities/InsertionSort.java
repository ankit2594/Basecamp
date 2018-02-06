package Capabilities;

public class InsertionSort {

	public static void main(String[] args) {
		int [] arr= {7,2,1,6,8,5,3,4,5,2,6,8,5,2,7,2,4,7,9,4,2,6,9};
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;
			}
		}
		for(int n: arr)
		{
			System.out.print(n+" ");
		}

	}

}
