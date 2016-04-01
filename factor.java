import java.util.*;
import java.io.*;
class factor
    {
    public static void main(String args[])
        {
          
//PART1:take number from user
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no to find prime Factor");
        int n=s.nextInt();
      

//PART2:logic to find prime no

        for(int i=2;i*i<=n;i++)
        {
           while (n % i == 0)
             {
             System.out.print(i + " ");
             n = n / i;
              }
        }
           
 //PART3:Printing the Prime Factors
                 if (n > 1)
                    System.out.println(n);
            else             
                 System.out.println();
         }
    }
