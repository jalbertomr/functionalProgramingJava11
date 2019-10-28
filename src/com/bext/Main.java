package com.bext;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static int totalValues(List<Integer> numbers) {
        int result = 0;
        for( int e : numbers) {
            result += e;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);

        System.out.println(totalValues(values));
    }


}
