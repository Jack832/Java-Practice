import java.util.*;
class narysearch
{
public static void main(String arg[])
{
// 	part one taking input
  	
  	int no=Integer.parseInt(arg[0]);
 	int min=0;
        int max=no;
//	user value
   
   while(min<=max)
	{
		int mid=(min+max)/2;
		System.out.println("this is your number??"+mid);
		System.out.println("your number is greater than   this?? Y/N");
    		Scanner sc= new Scanner(System.in);
		char result=sc.next().charAt(0);
    		if( result=='y')
		{
			min=mid;
    		}
    		else
		{
    			max=mid;
    		}
 	
	} 	
}
}
