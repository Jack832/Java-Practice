import java.util.*;
class harmonic
{
public static void main(String arg[])
	{
	double ans=1.0;
    Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	for(double i=2;i<=num;i++)
	{
     
     ans=ans+(1/i);
	}
     System.out.println("the nth harmonic of "+ans);
    }
}


