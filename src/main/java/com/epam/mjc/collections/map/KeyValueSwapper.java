package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            Integer initial = resultMap.getOrDefault(e.getValue(), Integer.MAX_VALUE);
            resultMap.put(e.getValue(), Math.min(initial, e.getKey()));
        }

        return resultMap;
    }
}
