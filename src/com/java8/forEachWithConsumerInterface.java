package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//class ConsImpl implements Consumer<Integer>{
//
//
//    public void accept(Integer i) {
//        System.out.println(i);
//    }
//}

public class forEachWithConsumerInterface {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(4,5,6,7,8);
      //  values.forEach(i -> System.out.println(i));

       // Consumer<Integer> c = new ConsImpl();

//        Consumer<Integer> c = new Consumer<Integer>(){
//            public void accept(Integer i)
//            {
//                System.out.println(i);
//            }
//        };

//        Consumer<Integer> c = (i) -> {
//                System.out.println(i);
//            }
//        ;
//
//        values.forEach(c);

        values.forEach( (i) -> {
            System.out.println(i);
        });
    }
}
