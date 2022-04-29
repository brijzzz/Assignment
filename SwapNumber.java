package com.bridgelabz.BasicCoreProgram;

public class SwapNumber {

    public static void main(String[] args) {

        int a = 8, b = 15;

        System.out.println("First no. = " + a);
        System.out.println("Second no. = " + b);

        int temp = a;

        a = b;

        b = temp;

        System.out.println("*Swapping*");
        System.out.println("First no. = " + a);
        System.out.println("Second no. = " + b);
    }
}

