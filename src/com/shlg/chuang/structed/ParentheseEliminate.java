package com.shlg.chuang.structed;

public class ParentheseEliminate {
    
    private static String changeStr(String s) {
        String result = "(";
        char[] ch = s.toCharArray();
        int bracketNum = 0;
        int i = 0;
        while (i < ch.length) {
            if (ch[i] == '(') {
                bracketNum++;
            } else if (ch[i] == ')') {
                if (bracketNum > 0) {
                    bracketNum--;
                } else {
                    throw new RuntimeException();
                }
            } else if (ch[i] == ',') {
                result += ch[i++];
                continue;
            } else if (ch[i] >= '0' && ch[i] <= '9') {
                result += ch[i];
            } else {
                throw new RuntimeException();
            }
            i++;
        }
        if (bracketNum > 0) {
            throw new RuntimeException();
        }
        result += ')';
        return result;
    }

    public static void main(String[] args) {
        String s = "(1,(2,3),(4,(5,6),7))";
        String result = changeStr(s);
        if (result != null) {
            System.out.println(result);
        }
        s = "((1,(2,3),(4,(5,6),7))";
        result = changeStr(s);
        if (result != null) {
            System.out.println(result);
        }
    }

}
