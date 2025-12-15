import java.util.*;
public class HashingExample {
  public static void main(String[] args){
    //Initializing a new HahsMap to store names and ages 
    // Time complexity: O(1);
    HashMap<String, Integer> map = new HashMap<>();
    //Get the size of the HashMap
    //Time Complexity: O(1)
    System.out.println("Initial HashMap: " + map);
    System.out.println("Initial HashMap size: " + map.size());
    // Add key-value pairs to the HashMap
    // Time Complexity: O(1)
    map.put("Bharat", 21);
    map.put("Deepak", 25);
    map.put("Raksh", 28);

    //Get the size of the HashMap after adding elements
    // Time Complexity: O(1) 
    System.out.println("HashMap after adding elements: " + map);
    System.out.println("HashMap size after adding elements: " + map.size());

    // Retrieve a value using a key
    //Time Complexity: O(1) on average

    System.out.println("Age of Bharat: " + map.get("Bharat"));
    System.out.println("Age of Mohan(not present): " + map.get("Mohan"));

    //Check if a key is present
    //Time Complexity : O(1) on average

    System.out.println("Is Bharat present? " + map.containsKey("Bharat"));
    System.out.println("Is Mohan Present? " + map.containsKey("Mohan"));

    //Display the hash codes of keys
    // Time Complexity: O(n);

    for(String key: map.keySet()){
        System.out.println("Hash code for " + key + ": " + key.hashCode());
    }
    // Print all values in the HashMap
    //Time Complexity: O(n);
    for(String key: map.keySet()){
        System.out.println(key);
    }
    //Print all values in the HashMap
    // Time complexity: O(n);
    System.out.println("All values in the HashMap: ");
    for(Integer value: map.values()){
        System.out.println(value);
    }
    //Iterate over the map and print each key-value pair
    //Time Complexity: O(n);
    for(String key: map.keySet()){
        System.out.println(key + ": " + map.get(key));
    }
    //Alternative iteration over the map using entrySet
    //Time Complexity: O(n);
    for(Map.Entry<String, Integer> entry : map.entrySet()){
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    //Adding a duplicate key updates the value
    //Time Complexity : O(1) on average
    map.put("Bharat", 33);
    System.out.println("HashMap after adding duplicate key: " + map);
    System.out.println("HashMap size after adding duplicate key: " + map.size());
    System.out.println("Updated age of Bharat: " + map.get("Bharat"));
    //Remove element from the map
    //TIme complexity: O(1) on average
    map.remove("Raksh");
    System.out.println("Hashmap after removing 'Raksh': " + map);
    System.out.println("HashMap size after removal: " + map.size());
    //Demonstrate hash collision handling
        String key1 = "FB"; // Example keys with the same hash code
        String key2 = "Ea";
         System.out.println("Hash code for " + key1 + ": " + key1.hashCode());
        System.out.println("Hash code for " + key2 + ": " + key2.hashCode());
        
        // Add the keys to the map
        // Time complexity: O(1) on average
        map.put(key1, 50);
        map.put(key2, 60);

        // Retrieve the values for the colliding keys
        // Time complexity: O(1) on average
        System.out.println("Value for " + key1 + ": " + map.get(key1));
        System.out.println("Value for " + key2 + ": " + map.get(key2));
        
        // Clear all entries in the HashMap
        // Time complexity: O(n)
        map.clear();
        System.out.println("HashMap after clear operation: " + map);
        System.out.println("HashMap size after clear operation: " + map.size());
    }
}

  
