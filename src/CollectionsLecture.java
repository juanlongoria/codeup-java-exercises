import java.util.HashMap;
import java.util.ArrayList;

public class CollectionsLecture {
    // A collection is a data structure that collects, or groups objects together.

    //int[] nums = int[5];

    public static void main(String[] args) {
        //To instantiate an ArrayList
        ArrayList<String> petNames = new ArrayList<String>();

        // .add() - adds an element to the ArrayList.
        //OVERLOADED METHDO - .add(index, item)
        petNames.add("Kali");
        petNames.add("Nikolai");
        petNames.add("Chorizo");
        petNames.add("Bevo");


        System.out.println(petNames);

        //With arrays we find the number of elements by using the .length field
        //With ArrayLists, we can use the .size() method.
        System.out.println(petNames.size());

        //.get(elementValue) - returns the index of where the element is.
        System.out.println(petNames.get(3));

        // .indexOf(elementValue) - reeturns the index of the first occurrence of the element specified.
        // returns -1 when the element does not exist in the array.
        System.out.println(petNames.indexOf("Bella"));

        for(String name : petNames) {System.out.println(name);}

        // .contains(element) - returns a boolean of whether or not the ArrayList contains an element
        System.out.println(petNames.contains("Bevo"));

        // .lastIndexOf() - return the index of the last occurrence of the specified element.
        petNames.add("Bevo");
        System.out.println(petNames.lastIndexOf("Bevo"));

        //.isEmpty() - returns a boolean whether or not the ArrayList has elements.
        System.out.println(petNames.isEmpty());

        // .remove(element) - No Return - removes the first occurrence of the element specified.
        petNames.remove("Bevo");
        System.out.println(petNames);

        // HASH MAPS

        // A hash map is a data structure for key-value pairs.

        HashMap<String, Person> people = new HashMap<>();

        Person p1 = new Person("Jay");
        Person p2 = new Person("Sam");
        Person p3 = new Person("Trevor");
        Person p4 = new Person("Bianca");

        // .put(key, value) - establishes the key and value.
        people.put(p1.getName(), p1);
        people.put(p2.getName(), p2);
        people.put(p3.getName(), p3);
        people.put(p4.getName(), p4);

        System.out.println(people);

        // .putIfAbsent(key, value) - only sets a key-pair value if it does not exist.
        people.putIfAbsent("Jay", new Person("Jay"));
        System.out.println(people);

        // .get(key) - returns the value for the specified key.
        System.out.println(people.get("Bianca").sayHello());

        // .getOrDefault() - like get, but with a defined value instead of null,
        System.out.println(people.getOrDefault("Adam", p1));

        // .containsKey() - returns a boolean whether or not the key exists in the Map
        System.out.println(people.containsKey("Bevo"));

        // .containsValue() - returns a boolean whether or not the Value exists in the Map
        System.out.println(people.containsValue(p1));

        // .remove(key) - NO RETURN remove a key-value pair
        people.remove("Trevor");
        System.out.println(people);

        // .replace(key, value) - replace a value at a given key
        people.replace("Jay", new Person("Jay"));

        System.out.println(people);

        // .clear() - NO RETURN - empties the array
        people.clear();

        // .isEmpty() - returns boolean on whether elements exist in the array or not.
        System.out.println(people.isEmpty());





    }
}
