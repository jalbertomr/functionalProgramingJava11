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
        int  result = 0;
        for (int e : values ){
            if ( e > 3 && e % 2 == 0) {
                result = e * 2;
                break;
            }
        }
        System.out.println("with for : " + result);

        System.out.println("with stream: " +
                values.stream()
                .filter(e -> e > 3)
                .filter(e -> e % 2 == 0)
                .map( e -> e * 2)
                .findFirst()
        );
    }

}
