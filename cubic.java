import java.util.*;
import java.util.ArrayList;
public class cubic 
{


public static void main(String arg[])
//part1:taking inputs from user
	{
    
	ArrayList<store> al=new ArrayList<store>();
	Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=sc.nextInt();
    int a[]=new int [size];
    int i=0,j=0,k=0;
//part3:taking input from user for array
    for(int p=0;p<size;p++)
    {
    System.out.println("enter the elements in array");
    a[p]=sc.nextInt();
    }
//part2:i,j,k triplets and compare
    for(i=0;i<size;i++)
	{
     for(j=i+1;j<size;j++)
     {
      for(k=j+1;k<size;k++)
        {
           if(a[i]+a[j]+a[k]==0)
             {
              System.out.println(+a[i]+""+a[j]+""+a[k]);
              store aa=new store(i,j,k);
              al.add(aa);
             }
        }
      }
     }
 //part3:printing the elements

for(store ak : al) 
{
System.out.println("the position is"+ak);
System.out.println("triplet is"+ak.u);
System.out.println("triplet is"+ak.n);
System.out.println("triplet is"+ak.l);
}
} 
}
class store
{
	int u,n,l;
	store(int y,int x,int z)
	{
		u=y;
		n=x;
		l=z;
	}
public String toString()
{
return +u+""+n+""+l;
}
}

