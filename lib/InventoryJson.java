//creating inventory class
//read json file and creat inventory obj=array of inv obj
//call calculate () in each inventory
//write into json file and print
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.util.Iterator;
import java.util.Arrays;
class InventoryJson
{
    public static void main(String[] args)
    {
        JSONParser parser = new JSONParser(); 
        try
        { 
           //path
              	Object obj = parser.parse(new FileReader("/home/bridgelabz4/practice/lib/jsond.json")); 
              	//object1
              	JSONObject jsonObj = (JSONObject) obj;
               	JSONArray nameInventory = (JSONArray) jsonObj.get("a");
              	//object2 for write
				JSONObject jsonObj2=new JSONObject();
           		for(int i=0;i<nameInventory.size();i++)
            	{
               	//search the content
                JSONObject jsonObj1=(JSONObject) nameInventory.get(i);
                long price=(long)jsonObj1.get("price");
                long weight=(long)jsonObj1.get("weight");
                String name=(String)jsonObj1.get("name");

                long tot=price*weight;

                System.out.println("name: "+name);
                System.out.println("weight: "+weight);
                System.out.println(" price: "+price);
                System.out.println("Total price: "+tot);
               	// printing and adding to object2
                nameInventory.add("name: "+name);
                nameInventory.add("weight: "+weight);
                nameInventory.add("price: "+price);
                nameInventory.add("total: "+tot);
                
                jsonObj2.put("a",nameInventory);
                
               
             
                    // Writing to a file 
                    File file=new File("/home/bridgelabz4/practice/lib/jsond.json"); 
                    FileWriter fileWriter = new FileWriter(file); 
                    System.out.println("Writing JSON object to file\n "); 
                    System.out.print(jsonObj2);
                     
                    fileWriter.write(jsonObj2.toJSONString()); 
                    System.out.println("\n");
                    fileWriter.flush(); 
                    fileWriter.close();
         
                }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace(); 
        } 
       }
}
