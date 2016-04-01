class Sub {
    private String drawTribleX(){

        // *** move trible(t) inside drawTribleX() ***
        class Trible {
            private int trible(int t){
                return t + t + t;
            }
        }

        return new Trible().trible(5);
    }
    public static void main(String[] args){
        Sub o = new Sub();
        System.out.println(o.drawTribleX());
    }
}
import java.util.*;
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
	int c=m.sum(a,b,fun()	
	{
		if((a+b)>10)
		{
		System.out.rintln("value is greater than 10");
		}
	});
    	System.out.println("the value of addition less than 10"+c);
	

	}
}
