import java.util.*;
import java.lang.*;
class power
{
public static void main(String arg[])
{
 	//part1: taking the value from user
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	double no=sc.nextInt();
    //part2: no should be less then 31
    if(no>31)
	{
    	for(double i=1.0;i<=no;i++)
		{
        	double a=2.0;
			double result=Math.pow(a,i);
            System.out.println("the value at 2^i"+result);
    	}
	}
}
}
