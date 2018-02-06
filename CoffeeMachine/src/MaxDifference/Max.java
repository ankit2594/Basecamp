package MaxDifference;

public class Max {

	public static void main(String[] args) {
		int [] arr={7,6,5,4,3,2,1};
		int lrg=arr[0];
		int index=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>lrg)
			{
				lrg=arr[i];
				index=i;
			}
		}
		int small=lrg;
		for(int i=0;i<index;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		if(small<lrg)
			System.out.println(lrg-small);
		else
			System.out.println("-1");
		
	}

}
