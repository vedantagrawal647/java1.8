package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,5,2,8,1);

        Stream<Integer> data = nums.stream();



        //data.forEach(n -> System.out.println(n));
        //data.forEach(n -> System.out.println(n)); //give error

        // long count = data.count();
        //System.out.println(count);

//        Stream<Integer>  sortedData = data.sorted(); // data is sort and data stream is consumed and produce new sorted stream
//        sortedData.forEach(n -> System.out.println(n));

//        Stream<Integer>  mappedData = data.map(n -> n*2);
//        mappedData.forEach(n -> System.out.println(n));

//        nums.stream()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n));

//        nums.stream()
//                .sorted()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n));

//        nums.stream()
//                .filter(n -> n%2==1)
//                .sorted()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n));

        //filter take the object of predicate
        //Predicate is the fuctional interface which have method test
        //Now suppose we not apply lambda expression then how we return value
//        Predicate<Integer> predi = new Predicate<Integer>() {
//
//            public boolean test(Integer n) {
//                return n%2 == 1 ;
//            }
//        };

        //Now if we apply lambda expression
//        Predicate<Integer> predi = n ->  n%2 == 1 ;

        // suppose we want sum of element present in list;
//        int v = data.reduce(0,(c,d)->c+d);
//        System.out.println(v);

        int v = nums.stream()
                .filter(n -> n%2==1)
                .sorted()
                .map(n -> n*2)
                .reduce(0,(c,d) -> c+d);
        System.out.println(v);




    }

}
