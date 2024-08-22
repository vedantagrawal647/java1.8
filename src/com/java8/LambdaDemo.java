package com.java8;

interface A{
     void show(int i);
}

//    class Xyz implements A{
//        public void show(int i) {
//            System.out.println("hello "+i);
//        }
//    }


public class LambdaDemo {
    public static void main(String[] args) {
        // A obj = new Xyz();
//         A obj = new A() //Anonymenous object
//         {
//             public void show(int i){
//                 System.out.println("Hell0 " + i);
//             }
//         };

        A obj = (i) ->{
            System.out.println("Hello " +i);
        };

    }
}
