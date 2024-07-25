package work;

import java.util.Arrays;

public class SortStringArrayjava8 {
    public static void main(String[] args) {
        String[] fruits={"Mango","Apple","Banana","Lichi","Kivi","Jacafruit"};
        //Asending Order
        Arrays.sort(fruits,(a,b)->a.compareTo(b));
        System.out.println(Arrays.toString(fruits));
        //Decending order
        Arrays.sort(fruits,(a,b)->b.compareTo(a));
        System.out.println(Arrays.toString(fruits));
    }
}
