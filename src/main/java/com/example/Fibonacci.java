package com.example;


public class Fibonacci{
    public Fibonacci(){

    }
    public static double fibo(int n) {
        if (n >= 0) {
            return Math.pow(2,n);
        } else {
            return -1;
        }
        

    }
    public static double fibo1(int n) {
        if (n >= 0) {
            return n * 2;
        } else {
            return -1;
        }
}