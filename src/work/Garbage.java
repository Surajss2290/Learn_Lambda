package work;

public class Garbage {
    public static void main(String[] args) {
        // Create some objects
        String str1 = new String("Hello");
        String str2 = new String("World");

        // Set objects to null to make them eligible for garbage collection
        str1 = null;
        str2 = null;

        // Suggest to the JVM to perform garbage collection
        System.gc();

        // Alternatively, you can use Runtime.getRuntime().gc();
        // Runtime.getRuntime().gc();

        System.out.println("Garbage collection requested.");
    }
}
