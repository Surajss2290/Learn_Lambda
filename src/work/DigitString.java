package work;

public class DigitString {
    public static void main(String[] args) {
        //How to check string contains only digit
        String a="12123";
        if (a.matches("[0-9]+")){
            System.out.println("containes");
        }else {
            System.out.println("not");
        }
    }
}
