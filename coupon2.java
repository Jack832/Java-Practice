//part1 create random numbers
import java.util.*;
import java.util.ArrayList;

public class coupon2
{
 	public static void main(String arg[])
        {
	ArrayList<Integer> coup= new ArrayList<>();
	int randomCount=0,a=0;
    Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of array list");
    int no=sc.nextInt();
	//part2 copy the distinct element in array
	while(a != no)
	{
	       	double p=Math.random();
            randomCount++;
            p=p*10;
            int pick=(int)p;
            
 	    	if(coup.contains(pick))
         	 {}
         	 else
			{
              coup.add(pick);
                 a++;
			}
    }
//part3: printing the array list
     System.out.println("the ranom runs "+randomCount);
            System.out.println(""+coup);
            
}     
}
      


