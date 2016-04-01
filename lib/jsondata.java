import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser; 
import org.json.simple.parser.ParseException;
class Inventory
{
	public static void main(String arg[])
	{
	try
	{
	String path="/home/bridgelabz4/practice/lib/jsond.json";
	FileReader  readdata = new FileReader(path);
	JSONParser par= new JSONParser();
	JSONObject obj=(JSONObject) par.parse(readdata);
	JSONArray arr= (JSONArray) obj.get("a");
   
		for(int i=0;i<arr.size();i++)
	    {
		System.out.println("the value at "+i+"a is"+arr.get(i));
        
        //pass the values
        
	    }
		
        }
	
		catch (FileNotFoundException e) 
		      						{e.printStackTrace();}
		catch (IOException ex) 
    		 						 {ex.printStackTrace();}
		catch (ParseException ex) 
    		  						{ex.printStackTrace();}
		catch (NullPointerException ex)
      		   						{ex.printStackTrace();}
}
}     
