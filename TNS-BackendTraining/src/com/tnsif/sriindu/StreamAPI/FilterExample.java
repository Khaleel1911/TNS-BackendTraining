package com.tnsif.sriindu.StreamAPI;

import java.util.*;
import java.util.stream.*;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        list.stream()
            .filter(n -> n > 25)
            .forEach(System.out::println); // 30, 40, 50
    }
}
