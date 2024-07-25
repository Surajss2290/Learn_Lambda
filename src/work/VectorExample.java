package work;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        // Create a Vector to store fruits
        Vector<String> fruits = new Vector<>();

        // Add some fruits to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");


        // Print the Vector contents
        System.out.println("Fruits: " + fruits);

        // Access an element by index (optional)
        String firstFruit = fruits.get(2);
        System.out.println("First fruit: " + firstFruit);
    }
}
