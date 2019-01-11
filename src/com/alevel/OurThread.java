package com.alevel;

public class OurThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}
