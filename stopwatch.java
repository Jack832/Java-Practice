import java.io.*;
import java.util.*;
import java.lang.*;
public class stopwatch
{
 	double starts=0,stops=0;
	public static void main(String arg[])
	{
//part calling the functions	
        Scanner s =new Scanner(System.in);
        stopwatch tm =new stopwatch();
        System.out.println("Do you want to start timer..?? ( y / n )");
        char ch=s.next().charAt(0);       
        if(ch=='y')
        {
            tm.Start();
            System.out.println("Press 'n' to stop timer ");
            char ch1=s.next().charAt(0);
            if(ch1=='n')
			
			{
				tm.Stop();
        	     
	    	}
		}
		double tim=tm.totaltime();
		System.out.println("time in sec"+tim);
	
     }

//part1:start
	public void Start()
	{
	starts=System.currentTimeMillis();
  	}
//part2:stop
	public void Stop()
	{
	stops=System.currentTimeMillis();
    }
//total time
    public double totaltime()
    {
     double times=(stops-starts)/1000;
     return times;
    }
}
