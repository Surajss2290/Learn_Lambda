package work;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_char {
      //Remove Duplicate Character from String
    public static void main(String[] args) {
        String str="Hello";
        Set<Character> set=new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
       for (Character c:set){
           System.out.print(c);
       }

    }
}
