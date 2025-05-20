package com.tnsif.sriindu.StreamAPI;

import java.util.*;
import java.util.stream.*;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum); // 10
    }
}

