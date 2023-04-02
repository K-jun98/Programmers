package org.example;

import java.util.Arrays;
import java.util.List;

class Solution {
    public static int solution(String s) {
        List<String> strs = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine");
        for (int i = 0; i < strs.size(); i++) {
            s = s.replaceAll(strs.get(i), "" + i);
        }

        return Integer.parseInt(s);
    }
}
