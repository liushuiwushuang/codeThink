package com.shlg.chuang.structed;

public class DeleteRepeatChar {

    private static String removeDuplicate(String str) {
        char[] chArray = str.toCharArray();
        int len = chArray.length;
        for (int i = 0; i < len; i++) {
            if (chArray[i] == '\0')
                continue;
            for (int j = i + 1; j < len; j++) {
                if (chArray[j] == '\0')
                    continue;
                if (chArray[i] == chArray[j])
                    chArray[j] = '\0';
            }
        }
        int L = 0;
        for (int i = 0; i < len; i++) {
            if (chArray[i] != '\0')
                chArray[L++] = chArray[i];
        }
        return new String(chArray, 0, L);
    }
    
    /*
     * bitMap 位示图法
     */
    private static String removeDuplicate2(String str) {
        char[] chArray = str.toCharArray();
        int len = chArray.length;
        int[] flags = new int[8];
        int i;
        for (i = 0; i < 8; i++)
            flags[i] = 0;
        for (i = 0; i < len; i++) {
            int index = (int) chArray[i] / 32;
            int shift = (int) chArray[i] % 32;
            if ((flags[index] & (1 << shift)) != 0)
                chArray[i] = '\0';
            flags[index] |= (1 << shift);
        }
        int L = 0;
        for (i = 0; i < len; i++) {
            if (chArray[i] != '\0')
                chArray[L++] = chArray[i]; 
        }
        return new String(chArray, 0, L);
    }
    
    private static String reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }
    /*
     * 正则表达式
     */
    private static String removeDuplicate3(String str) {
        str = reverse(str);
        str = str.replaceAll("(?s)(.)(?=.*\\1)", "");
        str = reverse(str);
        return str;
    }
    
    public static void main(String[] args) {
        String str = "abcaabcd";
        String str1 = removeDuplicate(str);
        System.out.println(str1);
        
        String str2 = removeDuplicate2(str);
        System.out.println(str2);
        
        String str3 = removeDuplicate3(str);
        System.out.println(str3);
    }

}
