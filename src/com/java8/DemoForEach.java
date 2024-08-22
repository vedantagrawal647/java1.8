package com.java8;

import java.util.*;

//External loops
public class DemoForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4,5,6,7,8);

        //external loop
        System.out.println("Normal loop ");
        for(int i=0;i<values.size();i++)
        {
            System.out.println(values.get(i));
        }

        System.out.println("Enhancement loop");

        //external loop
        for(int v:values)
        {
            System.out.println(v);
        }

        System.out.println("For Each");

        // In java* -- Internal loops
        values.forEach(i -> System.out.println(i)) ;  //consumer interface
        // this arrow is lambda function
    }
}
