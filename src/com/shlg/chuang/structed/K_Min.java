package com.shlg.chuang.structed;

public class K_Min {
    
    /*
     *  return a[k -1]
     */
    private static int quickSort(int[] a, int low, int high, int k) {
        if (low > high)
            throw new RuntimeException();
        int i = low;
        int j = high;
        int index = a[i];
        while (i < j) {
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];
            while (i < j && a[i] < index)
                i++;
            if (i < j)
                a[j--] = a[i];
        }
        a[i] = index;
        if (i < k - 1)
            return quickSort(a, i + 1, high, k);
        else if (i > k - 1)
            return quickSort(a, low, i - 1, k);
        else
            return a[k - 1];
    }
    
    private static int getKMin(int[] a, int k) {
        if (a == null || a.length < k)
            return Integer.MIN_VALUE;
        return quickSort(a, 0, a.length - 1, k);
    }

    public static void main(String[] args) {
        int[] a = { 1, 5, 2, 6, 8, 0, 6 };
        int kMin = getKMin(a, 4);
        System.out.println(kMin);
//        for (int i = 0; i < a.length; i++)
//            System.out.println(a[i]);
    }


}
