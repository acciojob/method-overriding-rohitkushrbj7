package com.driver;

public class Main {
    public static void main(String[] args) {
        B objB = new B();
        System.out.println("Calling method 'meth' from class A: " + objB.meth());
        System.out.println("Calling overridden method 'meth' from class B: " + objB.meth());
    }
}