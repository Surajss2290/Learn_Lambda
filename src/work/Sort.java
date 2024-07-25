package work;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Integer[] arr ={1,5,3,4,6};
        Arrays.sort(arr, (a, b) -> a - b);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,(a,b)->b -a);
        System.out.println(Arrays.toString(arr));
    }
}
