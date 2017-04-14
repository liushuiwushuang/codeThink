package com.shlg.chuang.structed;

public class CombineRecursiveImpl {
    
    public static void combineRecursiveImpl(char[] c, int begin, int len, StringBuilder sb) {
        if (len == 0) {
            System.out.print(sb + " ");
            return;
        }
        if (begin == c.length) {
            return;
        }
        sb.append(c[begin]);
        combineRecursiveImpl(c, begin + 1, len - 1, sb);
        sb.deleteCharAt(sb.length() - 1);
        combineRecursiveImpl(c, begin + 1, len, sb);
    }
    
    /*
     * 相当于从 001 遍历到 111
     */
    private static void combine(char[] c) {
        if (c == null)
            return;
        int len = c.length;
        boolean[] used = new boolean[len];
        char[] cache = new char[len];
        int result = len;
        while (true) {
            int index = 0;
            while (used[index]) {
                used[index] = false;
                ++result;
                if (++index == len)
                    return;
            }
            used[index] = true;
            cache[--result] = c[index];
            System.out.print(new String(cache).substring(result) + " ");
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int len = c.length;
        for (int i = 1; i <= len; i++) {
            combineRecursiveImpl(c, 0, i, sb);
        }
        System.out.println();
        combine(c);
    }

}
