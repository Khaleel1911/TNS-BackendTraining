package com.tnsif.sriindu.StreamAPI;

import java.util.*;
import java.util.stream.*;

public class SortedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Bob", "Anna");
        names.stream()
             .sorted()
             .forEach(System.out::println); // Anna, Bob, Zara
    }
}

