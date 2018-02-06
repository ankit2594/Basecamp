package CountingBits;

public class Logic 
{
    static int[] getOneBits(int n) 
    {
        String s=Integer.toBinaryString(n);
        System.out.println(s);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            count++;
        }
        int arr[]=new int[count+1];
        arr[0]=count;
        count=1;
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='1')
          {
              arr[count]=i+1;
              count++;
          }
        }
        return arr;
    }
}
