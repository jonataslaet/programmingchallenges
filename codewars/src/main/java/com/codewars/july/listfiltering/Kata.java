package com.codewars.july.listfiltering;

import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(item -> item instanceof Number).collect(Collectors.toList());
    }
}
