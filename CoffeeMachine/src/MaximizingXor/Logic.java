package MaximizingXor;

public class Logic 
{
	static int maximum_XOR(int a, int b)
	{
		int lrg=0;
		for(int i=a;i<=b;i++)
		{
			for(int j=a;j<=b;j++)
			{
				int m=i^j;
				if(m>lrg)
				{
					lrg=m;
				}
		
			}

		}
		return lrg;
		

	}

}
