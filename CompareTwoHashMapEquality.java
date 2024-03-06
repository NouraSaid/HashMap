// Java program to compare two HashSet keys 
import java.util.*; 
  
class CompareTwoHashMapEquality { 
    public static void main(String[] args) 
    { 
  
        // New HashMap1 
        HashMap<Integer, String> map1 = new HashMap<>(); 
  
        // Add elements to map 
        map1.put(1, "NOURA"); 
        map1.put(2, "SAID"); 
        map1.put(3, "MOHAMMED"); 
  
        // New HashMap2 
        HashMap<Integer, String> map2 = new HashMap<>(); 
  
        // Add elements to map  
        map2.put(3, "AFNAN"); 
        map2.put(2, "TAYPA"); 
        map2.put(1, "SHAIMA"); 
  
        // New HashMap3 
        HashMap<Integer, String> map3 = new HashMap<>(); 
  
        // Add elements to map  
        map3.put(1, "MOHAMMED"); 
        map3.put(2, "ALI"); 
        map3.put(4, "AHMED"); 
  
        // Compare map1 and map2 keys using keySet() and 
        // equals() method 
        System.out.println( 
            "map1 keys == map2 keys : "
            + map1.keySet().equals(map2.keySet())); 
  
        // Compare map1 and map3 keys using keySet() and 
        // equals() method 
        System.out.println( 
            "map1 keys == map3 keys : "
            + map1.keySet().equals(map3.keySet())); 
    } 
}