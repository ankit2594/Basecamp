package Game;

public class SecondLargest {

	public static void main(String[] args) {
		int [] arr={2,5,6,7,2,7,4,9,4};
		int lrgest=0;
		int lrg=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>lrg)
			{
				lrg=lrgest;
				lrgest=arr[i];
			}
		}
		System.out.println(lrg);

	}

}
