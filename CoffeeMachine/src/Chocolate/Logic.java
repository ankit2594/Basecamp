package Chocolate;

public class Logic 
{
	static void calculate(int[] arr) 
    {
       int sum=0;
        int temp=1;
       for(int i=0;i<arr.length;i++)
       {
         for(int j=1;j<=arr[i];j++)
         {
         if(j%2!=0)
         {
            sum+=j;             
         }
         }
           System.out.println(sum);
           sum=0;
          
       }
    }
}
