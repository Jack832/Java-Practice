import java.util.*;
import java.io.*;
class method
	{
	int sum(int a, int b){
     return a+b;
	
	}

	public static void main(String arg[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the first value");
	int a=sc.nextInt();

	System.out.println("enter the second value");
	int b=sc.nextInt();
	method m= new method();
	int c=m.sum(a,b,new fun()	
	{
	System.out.println("value is greater than 10");
		
	});
    	System.out.println("the value of addition less than 10"+c);
	

	}
}
