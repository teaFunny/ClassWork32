package com.alevel;

import java.util.Scanner;

public class Main {

     public static void doSmth(IFunctional functional){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        synchronized (s1) {
            boolean result = functional.test(s1, s2);
            System.out.println(result);
        }

        scanner.close();
    }

    public static void main(String[] args) {


        //doSmth((a, b) -> a.length() > b.length());
        //doSmth(String::endsWith);


        System.out.println(Thread.currentThread());
        Thread thread = new Thread(() -> {
            for( int i = 0; i < 100; i++){
                System.out.println(i);
            }

        });

        Thread thread2 = new Thread(() -> {
            for( int i = 10000; i < 10100; i++){
                System.out.println(i);
            }

        });

        thread2.start();
        thread.start();







        /*doSmth(new IFunctional() {
            @Override
            public boolean test(String a, String b) {
                return a.length() > b.length();
            }
        });*/
    }

}
