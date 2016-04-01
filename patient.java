import java.util.*;
import java.io.*;

class patient
{ int idp,page,pmobileno;
  String pname;
   patient(int id,int mobileno,int age,String name)
   {
	this.idp=id;
	this.pname=name;
	this.pmobileno=mobileno;
	this.page=age;
    }
	public static void main(String args[])
	{
    
    ArrayList<patient> al1= new ArrayList<>();
    System.out.println("enter the name mobileno age id");
    Scanner s =new Scanner(System.in);
    System.out.println("Do you want to enter..?? ( y / n )");
    char ch=s.next().charAt(0);       
    
    if(ch=='y')
    {
    System.out.println("enter your name \n");
    String nam=s.next(); 
 	System.out.println("enter id \n");
    int idc=s.nextInt();  
 	System.out.println("enter your mobile no\n");
    int mobile=s.nextInt();  
 	System.out.println("enter your age");
    int age=s.nextInt();
    patient p = new patient(idc,mobile,age,nam);
    al1.add(p);
    System.out.println("Do you want to enter..?? ( y / n )");
    ch=s.next().charAt(0);  
    } 
    
    } 
}
