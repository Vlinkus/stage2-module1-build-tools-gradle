package com.epam.demo;

import java.util.List;
import org.apache.commons.lang3.math.NumberUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().allMatch(x -> NumberUtils.isCreatable(x) && NumberUtils.toDouble(x)>0);
    }
}