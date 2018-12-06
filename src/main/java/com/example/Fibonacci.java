package com.example;


public class Fibonacci{
    public Fibonacci(){

    }
    public static long fibo(int n) {
        if (n >= 0) {
            return Math.pow(2,n);
        } else {
            return -1;
        }
    }
}