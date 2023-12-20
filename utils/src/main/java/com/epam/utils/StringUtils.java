package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean isPositive = false;
        if(!str.isEmpty()) {
            try {
                int number = Integer.parseInt(str);
                isPositive = number > 0;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        return isPositive;
    }
}
