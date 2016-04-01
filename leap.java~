import java.util.*;
import java.io.*;
public class leap
{
public static void main(String arg[])
	{
		int str;
    	String year;
    //part1: checking for year digits
	   	Scanner sc = new Scanner(System.in);
	   	System.out.println("enter the year");
	   	str=sc.nextInt();
	   	year=new Integer(str).toString();
       	int len=year.length();
	   	System.out.println("length"+len);
       	
   	//part2: leap year checking
         if(len==4)
           {
			if((str%400==0) || ((str%4==0) && (str%100 !=0)))
			{
			System.out.println("this is leap year"+str);
            }
        	else
        	{
			System.out.println("this is not leap year"+str);
            }
		   }
         
   }
}
