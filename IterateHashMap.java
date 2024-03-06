import java.util.*;
 
public class IterateHashMap {
public static void main(String[] args) {
         
    // Creating an empty HashMap
    HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
 
    // Mapping string values to int keys 
    studentMap.put(10, "Noura");
    studentMap.put(15, "Said");
    studentMap.put(20, "Mohammed");
    studentMap.put(25, "AlSaidi");
 
    // Iterate through the values of the HashMap and print each one
        System.out.println("Values in the HashMap:");
        for (String studentName : studentMap.values()) {
            System.out.println(studentName);
        }

    }

}