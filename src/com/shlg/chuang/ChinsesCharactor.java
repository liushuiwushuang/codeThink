package com.shlg.chuang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChinsesCharactor {
    
    public static void judgeChineseCharactor(String str) {
        String regex = "[\u4e00-\u9fa5]";
        
        if (str.getBytes().length == str.length()) {
            System.out.println("无汉字");
        } else {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.print(matcher.group(0) + " ");
            }
        }
    }

    public static void main(String[] args) {
        judgeChineseCharactor("Hello World");
        judgeChineseCharactor("Hello 您好");
    }

}
