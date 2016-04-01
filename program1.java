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
		String name="0";
		
		
		//part3:using while loop if name is less than3 char
		while(name.length() <3)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your name mimimum 3 char ");
			name=sc.next();
			if(name.lenght()>=3)
			{
			input = m.replaceAll(name);
			System.out.println(input);
			break;
			}
     		
	   }
		
	}
}
