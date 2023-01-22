package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String word : sentence.trim().split("\\W+")) {
            if (word.isEmpty()) continue;

            resultMap.put(word.toLowerCase(), resultMap.getOrDefault(word.toLowerCase(), 0) + 1);
        }

        return resultMap;
    }
}
