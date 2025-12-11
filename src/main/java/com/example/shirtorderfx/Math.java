package com.example.shirtorderfx;

import java.util.LinkedHashMap;
import java.util.Map;

public class Math {
    static final Map<String, Integer> sizes = new LinkedHashMap<>();
    static int hats = 0;

    static {
        sizes.put("S", 0);
        sizes.put("M", 0);
        sizes.put("L", 0);
        sizes.put("XL", 0);
        sizes.put("2XL", 0);
        sizes.put("3XL", 0);
        sizes.put("4XL", 0);
        sizes.put("LXS", 0);
        sizes.put("LS", 0);
        sizes.put("LM", 0);
        sizes.put("LL", 0);
        sizes.put("LXL", 0);
    }

    public static String process(String[] items) {
        // Reset counts
        sizes.replaceAll((k, v) -> 0);
        hats = 0;

        for (String item : items) {
            count(item);
        }
        return getCounts();
    }

    public static String getCounts() {
        StringBuilder result = new StringBuilder();
        sizes.forEach((size, count) -> result.append(size).append(": ").append(count * 2).append("\n"));
        result.append("Hats: ").append(hats);
        return result.toString();
    }

    public static void count(String list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (sizes.containsKey(list)) {
            sizes.put(list, sizes.get(list) + 1);
            hats++;
        }
    }
}
