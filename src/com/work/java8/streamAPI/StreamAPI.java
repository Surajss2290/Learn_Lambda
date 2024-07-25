package com.work.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

            List<Integer> list=Arrays.asList(2,5,7,8,9,10,11,30,40);

   //Iterate elemnt from list using stream API
        //First Way
        Stream<Integer> stream=list.stream();
        List newlist=stream.filter(i->i%2==0).collect(Collectors.toList());
       List<Integer> list1= list.stream().filter(integer -> integer>20).collect(Collectors.toList());
        System.out.println(list1);
        //  System.out.println(newlist);

        //We can write in one single line
        //System.out.println("Second way list "+list.stream().filt er(i->i%2==0).collect(Collectors.toList()));



    }
}
