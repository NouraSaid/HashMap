// Java Program to Iterate over HashMap
import java.util.HashMap;
import java.util.Map;
 
// Class for iterating HashMap using for loop
public class IterateHashMap {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Creating a HashMap
        Map<Integer, String> Language
            = new HashMap<Integer, String>();
 
        // Inserting elements to the adobe HashMap
        // Elements- Key value pairs using put() method
        Language.put(1, "Angular");
        Language.put(2, "Java");
        Language.put(3, "Python");
        Language.put(4, "Php");
 
        // Iterating HashMap through for loop using entrySet() 
        for (Map.Entry<Integer, String> set :
             Language.entrySet()) {
 
            // Printing all elements of a Map usning getValue()
            System.out.println(set.getKey() + " = "
                               + set.getValue());
        }
    }
}