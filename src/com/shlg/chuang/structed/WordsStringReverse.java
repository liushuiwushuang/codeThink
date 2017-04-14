package com.shlg.chuang.structed;

public class WordsStringReverse {
    
    private static void swap(char[] chars,int begin, int end) {
        while (begin < end) {
            char c = chars[begin];
            chars[begin] = chars[end];
            chars[end] = c;
            begin++;
            end--;
        }
    }
    
    private static String swapWords(String s) {
        char[] chars = s.toCharArray();
        swap(chars, 0, chars.length - 1);
        int begin = 0;
        // 对每个单词进行反转
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] ==' ') {
                swap(chars, begin, i - 1);
                begin = i + 1;
            }
        }
        swap(chars, begin, chars.length - 1);
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "how are you";
        System.out.println(swapWords(str));
    }

}
