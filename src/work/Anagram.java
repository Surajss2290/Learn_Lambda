package work;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String x="silente";
        String y="listen";
        //convert string to char array
        char a[]=x.toCharArray();
        char b[]=y.toCharArray();
        //Sort the Arrays
        Arrays.sort(a);
        Arrays.sort(b);

        boolean result= Arrays.equals(a,b);

        if (result){
            System.out.println("Anagram");
        }else {
            System.out.println("Not");
        }

    }
}
