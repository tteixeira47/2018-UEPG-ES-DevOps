package com.example;


public class Fibonacci{
    public Fibonacci(){

    }
    public static long fibo(int n) {
        if (n < 2) {
            return n*2;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}