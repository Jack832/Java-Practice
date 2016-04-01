clinique
list of Doctors associated with the Clinique.
Doctors by Name, Id, Specialization and Availability (AM,  PM or both).
list of patients who use the clinique
Patients by Name, ID, Mobile Number and Age.

import java.util.*;
import java.io.*;
//doctor information
class doctor
{ int did,davailab,dtime; 
  String dname,dspec;
  	doctor(int id, String name,String speci,int avalia)
	{
    this.did=id;
    this.dname=name;
    this.davailab=availa;
    this.dspec=speci;
    }
	 public static void main(String args[])
	{
       doctor r =new doctor();
       System.out.println("enter your info if your doctor.?? ( y / n )");
       char ch=s.next().charAt(0);       
       while(char ch=='y')
      {
    	Scanner s =new Scanner(System.in);
    	System.out.println("welcome doctor \n enter your name:");
    	String nam=s.next();
    	System.out.println("\n id:");
    	int idd=s.next();
    	System.out.println("\n specialization:");
    	String spec=s.next();
    	System.out.println("availability:");
    	int avaliability=s.next();
    	ArrayList<doctor> al= new ArrayList<>();
    	r.doctor(idd,nam,spec,avaliability);
    	al.add(r);
    }   
	}
}
      

