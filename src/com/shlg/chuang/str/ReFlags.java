package com.shlg.chuang.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReFlags {

    public static void main(String[] args) {
        String s = "java has regex\nJava has regex\n" +
                "JAVA has pretty good regular expressions\n" +
                "Regular expressions are in Java";
        Pattern pattern = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find())
            System.out.println(matcher.group());
    }

}
