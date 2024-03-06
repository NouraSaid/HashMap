
import java.util.*;
 
public class RetrieveValueHashMap {
public static void main(String[] args) {
         
    // Creating an empty HashMap
    HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
 
    // Mapping string values to int keys 
    studentMap.put(1, "Noura");
    studentMap.put(2, "Said");
    studentMap.put(3, "Mohammed");
    studentMap.put(4, "AlSaidi");
 
   // Retrieve a student's name using their student ID
        int studentIDToRetrieve = 2;
        String retrievedStudentName = studentMap.get(studentIDToRetrieve);

        // Check if the student ID exists in the HashMap
        if (retrievedStudentName != null) {
            // Print the retrieved student's name to the console
            System.out.println("Student ID: " + studentIDToRetrieve + ", Name: " + retrievedStudentName);
        } else {
            // Handle the case where the student ID is not found
            System.out.println("Student ID " + studentIDToRetrieve + " not found in the HashMap.");
        }
    }
}