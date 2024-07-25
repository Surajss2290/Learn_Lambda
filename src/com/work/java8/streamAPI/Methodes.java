package com.work.java8.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Methodes {
    public static void main(String[] args) {
        //Using filter() methode
        List<String> names=List.of("suraj","sandeep","tushar","roshan");
        List<String> newname=names.stream().filter(e->e.length()<=5).collect(Collectors.toList());
        System.out.println(newname);

        //Using map() methode
        List<Integer> numbers=List.of( 3,5,30,25,11,13,15);

       List<Integer> square= numbers.stream().map(i->i*i).toList();
       square.stream().forEach(e->{
           System.out.println(e);
       });
        System.out.println(square);

        //Methode Reference
        square.stream().forEach(System.out::println);

        //using Sort
        System.out.println("--------------Using sort---------------");
        square.stream().sorted().forEach(System.out::println);

        //using Min
        System.out.println("----------using Min---------");
        Integer min=square.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(min);

        //using Min
        System.out.println("----------using Max---------");
        Integer max=square.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(max);
    }
}
