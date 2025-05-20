package com.tnsif.sriindu.StreamAPI;

import java.util.*;
import java.util.stream.*;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "emma", "alex");
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println); // JOHN, EMMA, ALEX
    }
}

