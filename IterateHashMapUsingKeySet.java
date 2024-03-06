import java.util.*;
 
public class IterateHashMapUsingKeySet {
public static void main(String[] args) {
         
    // Creating an empty HashMap
    HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
 
    // Mapping string values to int keys 
    studentMap.put(10, "Noura");
    studentMap.put(15, "Said");
    studentMap.put(20, "Mohammed");
    studentMap.put(25, "AlSaidi");
 
    //printing HashMap
        printMap(studentMap);
    }

    // method used to print the Students with thier ID Using ketSet() method
    public static void printMap(Map<Integer, String> map) {
        for (Integer id : map.keySet()) {
            System.out.println("ID: " + id + ", Student Name: " + map.get(id));
        }
    }
}