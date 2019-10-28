package com.bext;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // find the double of the first even number greater than 3
        List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);

        // .filter High order funtion receives a function and decides if
        // evaluate now, later or never.
        // LAZY optimization don´t do nothing at all until it's required by one instruction
        // like findFisrt()
        System.out.println("with stream: " );
        final Stream<Integer> temp =
                values.stream()
                .filter(Main::isGreatherThan3)
                .filter(Main::isEven)
                .map(Main::doubleIt);
        //System.out.println(temp.findFirst());

    }

    private static boolean isGreatherThan3(Integer number) {
        System.out.println("isGreatherThan3 " + number);
        return number > 3;
    }

    private static boolean isEven(Integer number) {
        System.out.println("isEven " + number);
        return number % 2 == 0;
    }

    private static int doubleIt(Integer number) {
        System.out.println("doubleIt " + number);
        return number * 2;
    }

}
