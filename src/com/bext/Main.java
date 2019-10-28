package com.bext;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    // Dependency Inyection (Strategy Pattern) with Function composition, Predicate
    public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
        int result = 0;
        for( int e : numbers) {
            if (selector.test(e)) result += e;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);

        System.out.println("suma todos: " + totalValues(values, e -> true));
        System.out.println("suma even: " + totalValues(values, e -> e % 2 == 0));
    }


}
