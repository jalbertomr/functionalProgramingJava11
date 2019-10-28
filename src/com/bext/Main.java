package com.bext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    // pure functions, then can do Referential transparency takes less than 2 sec with parallelStream

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,5,4,6);

        System.out.println(
          values.parallelStream()
                .mapToInt(Main::doubleIt)
                .sum()
          );

    }

    private static int doubleIt(Integer number) {
        try { Thread.sleep(1000); } catch (Exception e) {}
        return number * 2;
    }


}
