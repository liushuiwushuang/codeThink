package com.shlg.chuang.structed;

public class WordCount {
    
    private synchronized static int wordCount(String s) {
        String cc = "new cc";
        cc = cc + "old";
        int word = 0;
        int count = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ')
                word = 0;
            else if (word == 0) {
                word = 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "I am  hehao";
        System.out.println(s + "单词个数为：" + wordCount(s));
    }

}
