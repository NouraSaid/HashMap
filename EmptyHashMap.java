import java.util.HashMap;


class EmptyHashMap {
    public static void main(String[] args) {

        // create a new hashmap
        HashMap<String, Integer> results = new HashMap<>();

        System.out.println("A HashMap for mapping marks to students");

        // check if the results hashmap is empty
        boolean empty = results.isEmpty();


        // add elements to the hashmap

        results.put("Noura", 100);
        results.put("AFNAN", 100);

        //display the hashmap

        System.out.println("HashMap: " + results);

        //check if it is empty again
        empty = results.isEmpty();
        if (empty)
        {
            System.out.println("The Results Hashmap is empty");
        }
        else
        {
            System.out.println("The Results Hashmap is not empty");
        }
    }
}