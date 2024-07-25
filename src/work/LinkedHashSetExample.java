package work;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // Create a LinkedHashSet to store unique names
        LinkedHashSet<String> names = new LinkedHashSet<>();

        // Add some names
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Bob"); // Duplicate will be ignored


        // Print the names in insertion order
        //System.out.println("Unique names: " + names);

        Iterator<String> it= names.iterator();
        while (it.hasNext()){
            String name= it.next();
            System.out.println(name);
        }

    }
}