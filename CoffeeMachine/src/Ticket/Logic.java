package Ticket;

public class Logic 
{
    static long waitingTime(int[] tickets, int p) 
    {
        int temp=0;
        int j=0;
        int [] count =new int [tickets.length];
        while(count[p]!=tickets[p])
        {
                if(count[j]>=0&&count[j]<tickets[j])
                {
                    count[j]++;
                    temp++;
                }
                if(j==p&&count[j]==tickets[j])
                {
                    return temp;
                }
            j++;
            if(j==tickets.length)
            j=0;
         }

        return temp;
}
}
