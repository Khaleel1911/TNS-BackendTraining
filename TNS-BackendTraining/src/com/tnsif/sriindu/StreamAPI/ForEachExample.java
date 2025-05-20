package com.tnsif.sriindu.StreamAPI;

import java.util.*;
import java.util.stream.*;

public class ForEachExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.stream().forEach(System.out::println);
    }
}
