import java.util.Random;
import java.io.*;
import java.util.*;
public class coinflip
{
	public static void main(String arg[])
	{
	//part1:random and taking flips
	double tail=0,head=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number flips you want ");
	int no =sc.nextInt();
	//part2: performing for flips.
	for(int i=0;i<no;i++)
	{
		if(Math.random() > 0.5)
		{
			tail++;
		}
		else
		{
			head++;
		}
    }
    
    //part 3:calculating percentage
	double perT, perH;
    perT=(tail/no)*100;
    perH=(head/no)*100;
	System.out.println("percentage for tail "+perT);
	System.out.println("percentage for head "+perH);
	}
}

 
 
     
