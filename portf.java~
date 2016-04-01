import java.util.*;
import java.util.ArrayList;

class portf
{
public static void main(String arg[])
{
//part1 : defining stocks ,stokes name and price in array
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the no of stocks");
    int no=sc.nextInt();
    int shares,vshare;
    String stocks;
    ArrayList<stock> al=new ArrayList<>();
    for(int p=0;p<no;p++)
    	{
    	System.out.println("enter the name of stocks");
    	stocks=sc.next();
    	System.out.println("enter the shares of stocks");
    	shares=sc.nextInt();
    	System.out.println("enter the value of share");
    	vshare=sc.nextInt();
    	stock st=new stock(stocks,shares,vshare);
        al.add(st);
        }
//part3 print the value using arraylist
	   for(stock ob :al)
	    {
         int kk=ob.stockofc();
     	 int as=ob.stocktotal();
	 	 System.out.println("the value is" +ob );
    	 System.out.println("the value of share is"+kk);
   	 	 System.out.println("the total value of share"+as);
         }
  }

}
class stock
{
	String nam;
	int shar=0,val=0;
    int total,totalv;
	stock(String name,int sha,int value)
	{
		nam=name;
	    shar=sha;
		val=value;
	}
	public String toString()
	{
		return "\ncompany name="+nam+"\nnumbers of share="+shar+"\nvalue per share= "+val;
	}
    public int stockofc()
	{
		total=shar*val;
		return total;
	}
	public int stocktotal()
	{
     	totalv =totalv+total;
     	return totalv;
    }
	
}



    


