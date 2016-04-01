import java.io.*;
import java.util.*;
import java.text.*;
class Doctor
{
    Doctor()
    {

    }
    int d_id=0;
    String name,spec,ava;
    int count=0,pop=0;
    Doctor(ArrayList <Doctor> doct, String nm, int id, String special,String available,int p)
    {
        name=nm;
        d_id=id;
        spec=special;
        ava=available;
        pop=p;
    }
    Doctor SearchByName(ArrayList<Doctor> doct, String nm1)
    {
        for(Doctor dt1: doct)
        {
            if((nm1.equals(dt1.name))==true)
            {
                return dt1;
            }
        }
            return null;
    }
    Doctor SearchById(ArrayList<Doctor> doct,int n)
    {
        for(Doctor dt1: doct)
        {
            if(n == dt1.d_id)
            {
                return dt1;
            }
        }
        return null;
    }
    void TakeAppointment(ArrayList<Doctor> doct,String nm)
    {   
        for(Doctor dt1: doct)
        {
            if((nm.equals(dt1.name))==true)
            {
                dt1.count++;
                if(dt1.count<=5)
                {
                    Date dNow = new Date( );
                    SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy hh:mm:ss a");

                    System.out.println("Today: " + ft.format(dNow));
                    String dt = (String) ft.format(dNow);
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");
                    Calendar c = Calendar.getInstance();
                    c.setTime(new Date());
                    c.add(Calendar.DATE, 1);
                    dt = sdf.format(c.getTime());
                    System.out.println("Appointment is fixed at: "+dt+" "+dt1.ava);
                }
                else
                    System.out.println("Doctor is unavailable");
            }
        }
    }
}
class Patient
{
    Patient()
    {

    }
    int p_id=0,age=0;
    long mobNo=0;
    String name;
    Patient(String nm, int id, long mno,int a)
    {
        name=nm;
        p_id=id;
        mobNo=mno;
        age=a;
    }
    Patient SearchByName(ArrayList<Patient> pat, String nm1)
    {
        for(Patient pt: pat)
        {
            System.out.println(" "+pt.mobNo);
        }
        System.out.println(" "+nm1);
        for(Patient pt1: pat)
        {
            if((nm1.equals(pt1.name))==true)
            {
                return pt1;
            }
        }
            return null;
    }
    Patient SearchById(ArrayList<Patient> pat,int n)
    {
        for(Patient pt1: pat)
        {
            if(n == pt1.p_id)
                return pt1;
        }
        return null;
    }
}
public class pra
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        ArrayList <Doctor> doc=new ArrayList();
        ArrayList <Doctor> tempArray=new ArrayList();
        int rno1=(int)(Math.random()*10);
        Doctor d=new Doctor(doc,"Mrunal",101,"Heart specialist","AM",rno1);
        doc.add(d);
        int rno2=(int)(Math.random()*10);
        Doctor d1=new Doctor(doc,"Uday",102,"Eye specialist","PM",rno2);
        doc.add(d1);
        int rno3=(int)(Math.random()*10);
        Doctor d2=new Doctor(doc,"Sharvari",103,"Ear specialist","AM",rno3);
        doc.add(d2);
        int rno4=(int)(Math.random()*10);
        Doctor d3=new Doctor(doc,"Priyanka",104,"Heart specialist","PM",rno4);
        doc.add(d3);

        int p=0;
        ArrayList <Patient> pat=new ArrayList();
        Patient p1=new Patient("Sourabh",201,9944556611L,22);
        pat.add(p1);
        Patient p2=new Patient("Naresh",202,9884456699L,23);
        pat.add(p2);
        Patient p3=new Patient("Sahel",203,9977885566L,25);
        pat.add(p3);

        while(true)
        {
            System.out.println("*** My Clinique ***");
            System.out.println("1. Search Doctor\n2. Search Patient\n3. Take appointment");
            System.out.println("4. Doctor list\n5. Patient List\n6. Popularity\n7. Exit");
            Doctor tm=new Doctor();
            Doctor dt1=new Doctor();
            Patient pt=new Patient();
            Patient pt1=new Patient();
            System.out.println("Enter your choice: ");
            int ch=s.nextInt();

            switch(ch)
            {
                case 1:
                        System.out.println(" a. Search doctor by name\n b.Search doctor by ID");
                        char in=s.next().charAt(0);
                        if(in=='a')
                        {
                            String name;
                            System.out.println("Enter name: ");
                            name=s.next();
                            tm=dt1.SearchByName(doc,name);
                        }
                        if( tm != null && in != 'b')
                        {
                            System.out.println("Doctor id: "+tm.d_id);
                            System.out.println("Doctor name: "+tm.name);
                            System.out.println("Doctor specification: "+tm.spec);
                            System.out.println("Doctor availability: "+tm.ava);
                            System.out.println("Doctor popularity: "+tm.pop);
                            p++;
                        }
                        if(in=='b')
                        {
                            System.out.println("Enter ID: ");
                            int num=s.nextInt();
                            tm=dt1.SearchById(doc,num);
                            if( tm != null)
                            {
                                System.out.println("Doctor id: "+tm.d_id);
                                System.out.println("Doctor name: "+tm.name);
                                System.out.println("Doctor specification: "+tm.spec);
                                System.out.println("Doctor availability: "+tm.ava);
                                System.out.println("Doctor popularity: "+tm.pop);
                                tm.pop++;
                                p=tm.pop;
                                System.out.println("Doctor pop: "+p);
                            }
                        }
                        break;
                case 2:    System.out.println(" a. Search patient by name\n b. Search patient by ID");
                        char inp=s.next().charAt(0);
                        if(inp=='a')
                        {
                            String name;
                            System.out.println("Enter name: ");
                            name=s.next();
                            pt=pt1.SearchByName(pat,name);
                        }
                        if( pt != null && inp != 'b')
                        {
                            System.out.println("Patient id: "+pt.p_id);
                            System.out.println("Patient name: "+pt.name);
                            System.out.println("Patient Mob no: "+pt.mobNo);
                            System.out.println("Patient age: "+pt.age);
                        }
                        if(inp=='b')
                        {
                            System.out.println("Enter ID: ");
                            int num=s.nextInt();
                            pt=pt1.SearchById(pat,num);
                            if( pt != null)
                            {
                                System.out.println("Patient id: "+pt.p_id);
                                System.out.println("Patient name: "+pt.name);
                                System.out.println("Patient Mob no: "+pt.mobNo);
                                System.out.println("Patient age: "+pt.age);
                            }

                        }
                        break;
                case 3:
                        System.out.println("Enter doctor name to take appointment: ");
                        String docName=s.next();
                        tm=dt1.SearchByName(doc,docName);
                        if(tm != null)
                        {
                            dt1.TakeAppointment(doc,docName);
                        }
                        break;
                case 4:
                        System.out.println("Doctor list: ");
                        for(Doctor dcount: doc)
                        {
                            System.out.println(" "+dcount.name);
                        }
                        break;
                case 5:
                        System.out.println("Patient list: ");
                        for(Patient pcount: pat)
                        {
                            System.out.println(" "+pcount.name);
                        }
                        break;
                case 6:
                        System.out.println("Clinique specialization: ");
                        System.out.println("Heart Specialist");
                        System.out.println("Eye Specialist");
                        System.out.println("Ear Specialist");
                        System.out.println("Popular doctors: ");
                        for(Doctor dcount: doc)
                        {
                            System.out.println(" "+dcount.name+" Rating: "+dcount.pop);
                        }
                       
                        break;                       
                case 7:System.exit(0);
            }
        }
    }
}

