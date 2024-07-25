package work;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String a="Hello    suraj   how are   you";
        String b=a.replaceAll("\\s+","");
        System.out.println(b);
    }
}
