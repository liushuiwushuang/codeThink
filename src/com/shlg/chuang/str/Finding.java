package com.shlg.chuang.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {

    public static void main(String[] args) {
        String s = "Evening is full of the linnet's wings";
        Matcher matcher = Pattern.compile("\\w+").matcher(s);
        while (matcher.find())
            System.out.println(matcher.group() + " ");
        System.out.println();
        int i = 0;
        while (matcher.find(i)) {
            System.out.println(matcher.group() + " ");
            i++;
        }
    }

}
