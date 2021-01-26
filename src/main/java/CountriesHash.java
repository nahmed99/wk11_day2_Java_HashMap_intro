import java.util.HashMap;

public class CountriesHash {

    /*
    Create a HashMap of keys and values for the populations of some countries.
    Here is some sample data (don’t forget to think about the types of your
    keys and values!):
        UK: 64,100,000
        Germany: 80,620,000
        France: 66,030,000
        Japan: 127,300,000
    Output some values from the HashMap using .get(key) and system.out.println().
    Investigate the use of the .values() and .keySet() methods on HashMap.
     */

    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulations = new HashMap<String, Integer>();

        countryPopulations.put("UK", 64_100_000);
        countryPopulations.put("Germany", 80_620_000);
        countryPopulations.put("France", 66_030_000);
        countryPopulations.put("Japan", 127_300_000);

        int populationUK = countryPopulations.get("UK");
        int populationJapan = countryPopulations.get("Japan");

        System.out.println(populationUK);
        System.out.println(populationJapan);

        System.out.println(countryPopulations.values());
        System.out.println(countryPopulations.keySet());

        // put(key, value: Insert a new key/value pair into the hashmap
        // get(jey): Returns the value for the given key
        // size(): Returns the number of key/value pairs in the hashmap
        // clear(): removes all the key/value pairs in the hashmap.
        // contains(value): Return boolean if value exists in hashmap.
        // remove(key): Removes pair with specified key.

    }



}
