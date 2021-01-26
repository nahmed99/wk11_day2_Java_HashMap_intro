import java.util.HashMap;

public class HashMapIntro {

    public static void main(String[] args) {
        HashMap<String, String> faveFruits = new HashMap<String, String>();

        faveFruits.put("Nawaz", "Amb");
        faveFruits.put("Me", "Amroot");
        faveFruits.put("Them", "Khela");

        String myFave = faveFruits.get("Nawaz");
        System.out.println(myFave);
        System.out.println(faveFruits.get("Me"));

        // put(key, value: Insert a new key/value pair into the hashmap
        // get(jey): Returns the value for the given key
        // size(): Returns the number of key/value pairs in the hashmap
        // clear(): removes all the key/value pairs in the hashmap.
        // contains(value): Return boolean if value exists in hashmap.
        // remove(key): Removes pair with specified key.

    }

}
