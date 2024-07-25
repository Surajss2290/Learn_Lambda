package com.work.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamObject {
    public static void main(String[] args) {
        //Stream API -collection process
        //Collection group of object

        //1-blank---------------
        Stream<Object> emptystream=Stream.empty();

        //2-Second way if you have object,collection,array-------------
        String[] names={"suraj","sandeep","Tushar","Roshan","Harsh"};
        Stream<String> stream= Stream.of(names);
        stream.forEach(e->{
            System.out.println(e);
        });

        //3-Builder Pattern-------------------------
        //Blank
       Stream<Object> streamBulder= Stream.builder().build();

       //4-using Arrays methode----------
        IntStream stream1=  Arrays.stream(new int[]{10,20,40,50});
        stream1.forEach(e->{
            System.out.println(e);
        });

        //5-List,set

        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        Stream<Integer> stream2=list.stream();
        stream2.forEach(e->{
            System.out.println(e);
        });

    }
}
