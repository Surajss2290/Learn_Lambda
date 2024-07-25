package work;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCount {

        public static void main(String[] args) {
            int[] str={1,2,1,3,4,2,5}; // Replace this with your input string

            Map<Integer, Integer> map = new HashMap<>();
            for(int ch:str){
                if (map.get(ch)==null){
                    map.put(ch,1);
                }else{
                    map.put(ch, map.get(ch)+1);
                }
            }
            System.out.println(map);
        }
}
