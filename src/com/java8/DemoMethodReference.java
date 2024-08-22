package com.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Parser{
    String parse(String s);
}

//here we write our own logic
 class MyParser{
    public static String convert(String s)
    {
        if(s.length()<=3)
        {
            s = s.toLowerCase();
        }
        else {
            s=s.toUpperCase();
        }
        return s;
    }
}
class MyPrinter{
    public void print(String s,Parser p)
    {
        s = p.parse(s);
        System.out.println(s);
    }
}

public class DemoMethodReference {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        //by using forEach loop
        //nums.forEach(i -> System.out.println(i));

        //by using refernce method
        nums.forEach(System.out::println);
        //In functional programming we are passing method as a parameter
        //means we are passing method inside method




        // if we are writing our own logic
        String str ="Vedant Agrawal";
        MyPrinter obj = new MyPrinter();
//        obj.print(str, new Parser() {
//            public String parse(String s) {
//                return MyParser.convert(s);
//            }
//        });

        //by using lambda expression
       // obj.print(str,s -> MyParser.convert(s));

        //by method references
        obj.print(str,MyParser::convert);

    }
}
