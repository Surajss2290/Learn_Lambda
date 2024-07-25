package work;

import java.util.HashMap;
import java.util.Map;
                      //FIRST NON-Repeating Character
public class findfirstnonrepeatingchar {
    public static void main(String[] args) {
        String str="helhel";

        Map<Character,Integer> map=new HashMap<>();
        for (char c:str.toCharArray()){
            if (map.get(c)==null){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }

        for (int i=0;i<str.length();i++){
            int currentfreq= map.get(str.charAt(i));

           if (currentfreq==1){
               System.out.println(str.charAt(i));
               break;
           }
        }

    }


}
