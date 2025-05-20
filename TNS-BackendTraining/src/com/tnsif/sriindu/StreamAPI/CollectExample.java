package com.tnsif.sriindu.StreamAPI;

import java.util.*;
import java.util.stream.*;

public class CollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "bb", "ccc", "dd");
        List<String> filtered = names.stream()
                                     .filter(s -> s.length() > 1)
                                     .collect(Collectors.toList());
        System.out.println(filtered); // [bb, ccc, dd]
    }
}

