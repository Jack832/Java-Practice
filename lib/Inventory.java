import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.util.Iterator;
import java.util.Arrays;
class Inventory
 {
    public static void main(String[] args)
    {
        JSONParser parser = new JSONParser(); 
        try
        { 
            Object obj = parser.parse(new FileReader("/home/bridgelabz4/practice/lib/jsond.json")); 

            JSONObject jsonObj = (JSONObject) obj;
            JSONArray nameInventory = (JSONArray) jsonObj.get("a");
            JSONObject jsonObj2=new JSONObject();
            for(int i=0;i<nameInventory.size();i++)
 			{
                JSONObject jsonObj1=(JSONObject) nameInventory.get(i);
                long price=(long)jsonObj1.get("Price");
                long weight=(long)jsonObj1.get("Weight");
                String name=(String)jsonObj1.get("Name");
                long tot=price*weight;
                System.out.println("Name: "+name);
                System.out.println("Weight: "+weight);
                System.out.println(" Price: "+price);
                System.out.println("Total price: "+tot);
                nameInventory.add("Name: "+name);
                nameInventory.add("Weight: "+weight);
                nameInventory.add("Price: "+price);
                nameInventory.add("Total: "+tot);
                jsonObj2.put("InventoryList",nameInventory);
                //System.out.println("Inventory: "+jsonObj.get("InventoryList"));
               
             
                    // Writing to a file 
                    File file=new File("/home/bridgelabz4/practice/lib/jsond.json"); 
                    FileWriter fileWriter = new FileWriter(file); 
                    System.out.println("Writing JSON object to file"); 
                    System.out.println("-----------------------"); 
                    System.out.print(jsonObj2);
         
                    fileWriter.write(jsonObj2.toJSONString()); 
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
