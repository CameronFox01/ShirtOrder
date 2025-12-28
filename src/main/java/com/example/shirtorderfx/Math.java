package com.example.shirtorderfx;

import java.util.LinkedHashMap;
import java.util.Map;

public class Math {
    static final Map<String, Integer> genderedSizes = new LinkedHashMap<>();
    static final Map<String, Integer> unisexSizes = new LinkedHashMap<>();
    static int hats = 0;
    //This is the sizes for gendered
    static {
        genderedSizes.put("S", 0);
        genderedSizes.put("M", 0);
        genderedSizes.put("L", 0);
        genderedSizes.put("XL", 0);
        genderedSizes.put("2XL", 0);
        genderedSizes.put("3XL", 0);
        genderedSizes.put("4XL", 0);
        genderedSizes.put("LXS", 0);
        genderedSizes.put("LS", 0);
        genderedSizes.put("LM", 0);
        genderedSizes.put("LL", 0);
        genderedSizes.put("LXL", 0);
    }
    //This is the sizes for Unisex
    static {
        unisexSizes.put("S", 0);
        unisexSizes.put("M", 0);
        unisexSizes.put("L", 0);
        unisexSizes.put("XL", 0);
        unisexSizes.put("2XL", 0);
        unisexSizes.put("3XL", 0);
        unisexSizes.put("4XL", 0);
    }

    public static String genderProcess(String[] items) {
        // Reset counts
        genderedSizes.replaceAll((k, v) -> 0);
        hats = 0;

        for (String item : items) {
            genderedCount(item);
        }
        return genderGetCounts();
    }

    public static String unisexProcess(String[] items){
        unisexSizes.replaceAll((k, v) -> 0);
        hats = 0;

        for (String item : items) {
            unisexCount(item);
        }
        return unisexGetCounts();
    }

    public static String genderGetCounts() {
        StringBuilder result = new StringBuilder();
        genderedSizes.forEach((size, count) -> result.append(size).append(": ").append(count * 2).append("\n"));
        result.append("Hats: ").append(hats);
        return result.toString();
    }

    public static String unisexGetCounts(){
        StringBuilder result = new StringBuilder();
        unisexSizes.forEach((size, count) -> result.append(size).append(": ").append(count).append("\n"));
        return result.toString();
    }

    public static void genderedCount(String list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (genderedSizes.containsKey(list)) {
            genderedSizes.put(list, genderedSizes.get(list) + 1);
            hats++;
        }
    }

    private static void unisexCount(String list){
        if (list == null || list.isEmpty()) {
            return;
        }

        if(!unisexSizes.containsKey(list)){
            if (list.equals("LXS") || list.equals("LS") ||list.equals("LM")) {
                list = "S";
            } else if (list.equals("LL")){
                list = "M";
            } else if (list.equals("LXL")){
                list = "L";
            }
        }
        if(unisexSizes.containsKey(list)){
            unisexSizes.put(list, unisexSizes.get(list) + 1);
        }
    }
}
