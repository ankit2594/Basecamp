package Game;

public class Pattern {

	public static void main(String[] args) 
	{
		int stars=5;
		for(int i=1;i<=9;i++)
		{
			for(int j=stars;j>=1;j--)
			{
				System.out.print("*");
			}
		
		System.out.println();
		if(i<=4)
		{
			stars--;
		}
		else
		{
			stars++;
		}
			
		}

	}

}
