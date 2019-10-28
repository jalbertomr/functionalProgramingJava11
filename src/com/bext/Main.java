package com.bext;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // find the double of the first even number greater than 3
        List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);

        System.out.println("with stream: " +
                values.stream()
                .filter(Main::isGreatherThan3)
                .filter(Main::isEven)
                .map( e -> e * 2)
                .findFirst()
        );
    }

    private static boolean isGreatherThan3(Integer number) {
        return number > 3;
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

}
