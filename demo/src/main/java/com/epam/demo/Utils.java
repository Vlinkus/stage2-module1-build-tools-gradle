package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return !args.stream().anyMatch(x -> {
            int number = -1;
            try {
                number = Integer.parseInt(x);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            return number < 0;
        });
    }
}