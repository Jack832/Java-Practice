import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.text.*;
 
      public class templatep
	{
      public static void main(String a[])
	{
      String input="Hello <<name>> We have your full as <<full name>> in our system. your contact number is 91-9643132052 . Please,let         us know in case of any clarification Thank you 01/01/2016  BridgeLabz.";
     String patt="<<name>>";
     String Replace="sourabh"; 
     String patt1="<<full name>>";
     String Replace1="sourabh more";
     String patt2="91-[0-9]{10}";
     String Replace2="987456321";
     String patt3="((\\d){2}/(\\d){2}/(\\d){4})";
     String output;
     
     Pattern p = Pattern.compile(patt);
     Matcher m = p.matcher(input); 
     input=m.replaceAll(Replace);
    
     
     Pattern p1 = Pattern.compile(patt1);
     Matcher m1 = p1.matcher(input); 
     input = m1.replaceAll(Replace1);

     Pattern p2 = Pattern.compile(patt2);
     Matcher m2 = p2.matcher(input); 
     input=m2.replaceAll(Replace2);
        
      	Pattern p3 = Pattern.compile(patt3);
    	Matcher m3 = p3.matcher(input); 
      	Date today = new Date();  
        input=m3.replaceAll(new SimpleDateFormat("dd/MM/yyyy").format(today));
		System.out.println(input); 
    
}}

        

