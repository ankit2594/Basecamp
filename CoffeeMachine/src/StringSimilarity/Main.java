package StringSimilarity;

public class Main {

	public static void main(String[] args) 
	{
		String [] inputs={"ababaa","aa"};
		int [] res=Logic.stringSimilarity(inputs);
		for(int a: res)
		{
			System.out.println(a);
		}

	}

}
