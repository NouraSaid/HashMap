// Remove an Entry from HashMap
import java.util.*;
 
public class HashMapRemove {
public static void main(String[] args) {
         
    // Creating an empty HashMap
    HashMap<Integer, String> student = new HashMap<Integer, String>();
 
    // Mapping string values to int keys 
    student.put(10, "Noura");
    student.put(15, "Said");
    student.put(20, "Mohammed");
    student.put(25, "AlSaidi");
 
    // Displaying the HashMap
    System.out.println("\nInitial Mappings are: " + student); 
 
    // Removing the existing key mapping
    String studentId = (String)student.remove(20);
 
 
    // Displaying the new map
    System.out.println("\nNew map is: "+ student);
}
}