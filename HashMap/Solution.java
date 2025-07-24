import java.util.HashMap;
import java.util.Map;

// Note: HashMap is a data structure that stores key-value pairs.
public class Solution {
    public static void main(String [] args){
        // Initialize a HashMap with a < key, value >
        HashMap<String, Integer> myHashMap = new HashMap<>();

        // Insert (or update) key-value pairs
        myHashMap.put("apple", 3);
        myHashMap.put("banana", 6);
        myHashMap.put("grape", 2);

        // Return all key-value pairs in myHashMap
        for(Map.Entry<String, Integer> entry : myHashMap.entrySet()){
            System.out.println("Key -> Value: " + entry.getKey() + " -> " + entry.getValue());
        }

        // Get (Retrieve) value for the key
        Integer bananaValue = myHashMap.get("banana");  // Returns 6 for output

        System.out.printf("%s %s\n\n", bananaValue, "is value for key, banana");

        // Remove the key (and its value) from the map
        myHashMap.remove("grape");  // Remove "grape" and its value 2

        // Check if key exists
        System.out.println("Check if there's a key named apple: " + myHashMap.containsKey("apple"));    // Return true

        // Check if value exists
        System.out.println("Check if there's a value named 2: " + myHashMap.containsValue(2));  // return false

        // Check if map is empty 
        Boolean mapIsEmpty = myHashMap.isEmpty();

        System.out.println("HashMap is empty: " + mapIsEmpty);  // Returns false

        // Check size of key-value pairs
        Integer mapSize = myHashMap.size(); // Returns 2 since map has 2 pairs

        System.out.println("HashMap has " + mapSize + " key-value pairs!");

        // Clear all entries from the map
        myHashMap.clear();

        mapSize = myHashMap.size(); // Returns 0 since map has 0 pairs now after clear()

        System.out.println("HashMap now has " + mapSize + " key-value pairs!");

    }
}
