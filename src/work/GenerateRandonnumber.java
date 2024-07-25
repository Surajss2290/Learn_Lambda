package work;

public class GenerateRandonnumber {

    public static boolean generate(){
        return  Math.random()>10;
    }
    public static void main(String[] args) {
        System.out.println(generate());
    }
}
