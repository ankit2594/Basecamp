package Game;

public class Permutations {

	public static void main(String[] args) 
	{
		String s="Ankit";
		int temp=1;
		String k="";
		
		for(int i=0;i<s.length();i++)
		{
			char p=s.charAt(i);
			k+=p;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)!=p)
				{
					k+=s.charAt(j);
				}
			}
			System.out.println(k);
			k="";
		}

	}

}
