package com.isa.sorter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorter {

    public static Map<Integer, String> sortByValue(Map<Integer, String> inputMap) {
        return inputMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, HashMap::new));
    }
}