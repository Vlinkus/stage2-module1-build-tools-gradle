package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
       return NumberUtils.isCreatable(str) && NumberUtils.toInt(str)>0;
    }
}
