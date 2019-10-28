package com.bext;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
    }

    private static boolean isPrime(final int number) {
        Predicate<Integer> isDivisible = divisor -> (number % divisor == 0);

        return (number > 1) &&
                IntStream.range(2, number)
                        .noneMatch(index -> isDivisible.test(index));
                        //java11 must be .test to call functional Interface.
    }
}
