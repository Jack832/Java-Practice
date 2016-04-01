import java.util.*;
public class gambler
{
//part stake goal random amount
public static void main(String arg[])
{
        Scanner sc= new Scanner(System.in);
	System.out.println("enter the Stake");
        int str=sc.nextInt();
        System.out.println("enter the goal amount");
        int goal=sc.nextInt();
	System.out.println("enter the numbers of time you want to stay");
        int no=sc.nextInt();
        int flag=0;
        int score=str;
      while(no>0)
	{

	//part random to win or loss
  
          if(Math.random()> 0.6)
          {
          	no--;
                System.out.println("win");
          	flag=1;
          }
          else
	  {
	 	no--;
                System.out.println("loss");
         	flag=2;
     	  }
        }
//part 2 condition after every loss broke or goal
switch(flag)
{
case 1:
          score=score+1;
          if(score==goal)
          {
           System.out.println("you reach the goal");
          break;
           }
case 2:  score=score-1;
          if(score<(str-2))
          {
           System.out.println("bye");
          break;
	  }
default:
	System.out.println("byee");
}
}}
