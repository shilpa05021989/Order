package com.dynamic.programming.demo.recursion;

public class App {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        //System.out.println(recursion.iterator(6));
        //System.out.println(recursion.headRecursion(6));
        System.out.println(recursion.tailFib(5,0,1));
    }
}
