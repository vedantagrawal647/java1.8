package com.java8;

interface phone{
    void call();
    default void message(){
        System.out.println("message");
    }
}

class AndroidPhone implements phone{
    public void call(){
        System.out.println("Calling");
    }
}

public class DemoInterface{
    public static void main(String[] args) {
        phone p = new AndroidPhone();
        p.call();
        p.message();
    }
}