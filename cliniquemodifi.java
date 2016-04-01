import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.text.*;
import java.util.Date;
//doctor info
class doctor
{  
  int did,davail;
   String dname,dspec;
	doctor(int id,String name,String spec,int avail)
	{
	this.did=id;
	this.dname=name;
	this.dspec=spec;
	this.davail=avail;
   	}
        
   public void print()
  {
   System.out.println("the id of doctor is"+did);
   System.out.println("the name of doctor is"+dname);
   System.out.println("the ava of doctor "+davail);
   System.out.println("the speci of doctor is"+dspec);
  }
}
//patient info
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
}
//main class 
public class cliniquemodifi
{
//variables
static ArrayList<patient> al1= new ArrayList<>();
static ArrayList<doctor> al= new ArrayList<>();
static int value=0,ava=0,a=0,count=0;
//methods
public static void appointment(String na)
{
  for(doctor d:al)
    {
     if(na.equals(d.dname)) 
      {
      	System.out.println("doctor found");
      
     
  if(a<3)
   {
	Date da = new Date();
    int hours = da.getHours();
    int day=da.getDay();
    System.out.println("the hours"+hours);
    System.out.println("the hours"+day);
    if(hours<ava+6)
    {
    String time= (ava<12) ? "AM":"PM"; 
    ava=ava+1;
    System.out.println("appointment fixed at:"+ava+"in"+time+"docor specis"+d.dspec);
    ArrayList<Integer> al2 = new ArrayList<>();
    a++;
    }
    else
    { 
     System.out.println("no appointment");
     }
    }
   else
   { 
     System.out.println("no appointment");
   }
   
}}}
public static void star(String pup)
{
	for(doctor r :al)
	{
     if(pup.equals(r.dname))
     {
	int sta=0;
	Random ra= new Random();
	int review=ra.nextInt(10);/*
    	System.out.println("doctor stars"+review);
   	System.out.println("doctor stars"+count);*/
	sta=(count+review);
	System.out.println("doctor stars"+sta);
	}}
}
  public static void main(String arg[])
  {
    //doctor
   cliniquemodifi q= new cliniquemodifi();
    Scanner s =new Scanner(System.in);
    //static int value=0,ava=0,a=0;
    
do
   {
    System.out.println("to add doctor to file 		1");
    System.out.println("to add patient info   		2");
    System.out.println("to search doctor by name 	3");
    System.out.println("to search doctor by id 		4");
    System.out.println("to search patient by name 	5");
    System.out.println("to search patient by mobile 6");
    System.out.println("take appointment			7");
    System.out.println("popularity of doctor 		8");
    System.out.println("entre the value");
    value=s.nextInt(); 
   
    switch(value)
    {
    case 1:
    System.out.println("Do you want to enter..?? ( y / n )");
    char ch1=s.next().charAt(0);       
    
    if(ch1 =='y')
    {
    System.out.println("enter your name \n");
    String nam=s.next(); 
    System.out.println("enter id \n");
    int idc=s.nextInt();  
    System.out.println("enter your specialization\n");
    String spe=s.next();  
 	System.out.println("enter your availability\n");
    ava=s.nextInt();
    doctor r=new doctor(idc,nam,spe,ava);
    al.add(r);
    r.print();
    System.out.println("Doctor "+idc+"is"+al);
    System.out.println("Do you want to enter..?? ( y / n )");
    ch1=s.next().charAt(0);  
    } 
    break;
    case 2:
    // patient 
    
    System.out.println("y or n ");
    char ch=s.next().charAt(0);       
    if(ch =='y')
    {
    System.out.println("enter your name ");
    String namp=s.next(); 
 	System.out.println("enter id \n");
    int idcp=s.nextInt();  
 	System.out.println("enter your mobile no\n");
    int mobilep=s.nextInt();  
 	System.out.println("enter your age");
    int agep=s.nextInt();
    patient p = new patient(idcp,mobilep,agep,namp);
    al1.add(p);
    System.out.println("patient "+idcp+"is"+al1);
    System.out.println("Do you want to enter..?? ( y / n )");
    ch=s.next().charAt(0);  
    } 
    break;
    case 3:
   System.out.println("search doctor by name");
   String val=s.next(); 
   //searchname(val);
   count++;
   for(doctor d:al)
    {
     if(val.equals(d.dname))
      {
       	System.out.println("doctor found");
      }
    }
   break; 
   case 4:
   System.out.println("search doctor by id");
   int va=s.nextInt(); 
   //searchid(va);
   count++;
   for(doctor d:al)
    {
     if(va==d.did)
      {
       	System.out.println("doctor found");
      }
    }
   break;
   case 5:
    System.out.println("search patient  by name");
    val=s.next(); 
    //searchnamep(val);
   for(patient p:al1)
    {
     if(val.equals(p.pname))
      {
       	System.out.println("patient found");
      }
    }
   break;
   case 6:
   System.out.println("search patient by mobile");
   int vl=s.nextInt(); 
   //searchmobile(vl);
    for(patient p:al1)
    {
     if(vl==p.pmobileno)
      {
       	System.out.println("patient found");
      }
    }
   break;
   case 7:
   System.out.println("please enter your doctor name");
   String vp=s.next();
   appointment(vp); 
   break;
   case 8:
   System.out.println("please enter doctor name");
   String vpp=s.next();
   star(vpp);
   case 9:
   System.out.println("Doctor list: ");
    for(doctor d: al)
   {
      System.out.println(" "+d.dname);
    }
   default :
    System.out.println("Do you want to enter again.?? ( yes / no )");
    String y=s.next();  
}
}
while(value<10);
}
}


    


