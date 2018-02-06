package Maker;

public class Checker 
{
   public static void main(String[] args) 
   {
	   String g=Integer.toBinaryString(50);
       String k="";
       for(int i=0;i<g.length();i++)
       {
          if(g.charAt(i)=='0')
          {
              k+='1';
          }
           else
          {
              k+='0';
          }
       }
   }
}
