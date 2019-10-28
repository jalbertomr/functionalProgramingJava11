package com.bext;

import java.util.Arrays;
import java.util.List;

interface Selector {
    public boolean pick(int value);
}

class EvenSelector implements Selector {
    @Override
    public boolean pick(int value) {
        return value % 2 == 0;
    }
}

public class Main {
    // Dependency Inyection (Strategy Pattern) with OOP composite
    public static int totalValues(List<Integer> numbers, Selector selector) {
        int result = 0;
        for( int e : numbers) {
            if (selector.pick(e)) result += e;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);

        System.out.println("suma todos: " + totalValues(values, e -> true));
        System.out.println("suma even: " + totalValues(values, new EvenSelector()));
    }


}
