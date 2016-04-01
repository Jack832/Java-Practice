import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class replacetemplate
{
	public static void main(String arg[])
	{
		//part1: writing word to replace and input
		String find="<<UserName>>";
		String input="Hello <<UserName>>, How are you?";
		//part2:creating pattern object and our input
		Pattern p = Pattern.compile(find);
		Matcher m = p.matcher(input); 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name ");
		String name=sc.next();
			
		//part3:using while loop if name is less than3 char
		if(name.length() <3)
		{
		System.out.println("enter your name mimimum 3 char ");				
		}
                else
		{
		input = m.replaceFirst(name);
		System.out.println(input);
		}
     		
	   }
}
