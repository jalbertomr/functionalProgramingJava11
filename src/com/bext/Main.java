package com.bext;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
    }

    private static boolean isPrime(final int number) {
        //Imperative
        //mutability
        //for (int i = 2; i < number; i++) {
        //    if (number % i == 0) return false;
        //}
        //return number > 1;

        //Declarative
        //inmmutability
        return (number > 1) &&
                IntStream.range(2, number)
                        .noneMatch(i -> number % i == 0);
    }


}
