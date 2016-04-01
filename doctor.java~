import java.util.*;
import java.io.*;

class doctor1
{  int did,davail;
   String dname,dspec;
	doctor1(int id,String name,String spec,int avail)
	{
	this.did=id;
	this.dname=name;
	this.dspec=spec;
	this.davail=avail;
	}
}

public class doctor
{
public static void main(String arg[])
	{
    
    ArrayList<doctor1> al= new ArrayList<>();
    
    System.out.println("enter the name id spec avail");
    
	Scanner s =new Scanner(System.in);
    System.out.println("Do you want to enter..?? ( y / n )");
    char ch1=s.next().charAt(0);       
    
    if(ch1=='y')
    {
    System.out.println("enter your name \n");
    String nam=s.next(); 
 	System.out.println("enter id \n");
    int idc=s.nextInt();  
 	System.out.println("enter your specialization\n");
    String spe=s.next();  
 	System.out.println("enter your availability\n");
    int ava=s.nextInt();
    doctor1 r=new doctor1(idc,nam,spe,ava);
    al.add(r);
    System.out.println("Do you want to enter..?? ( y / n )"+al);
    ch1=s.next().charAt(0);  
    } 
   }
}

