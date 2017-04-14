package com.shlg.chuang.sort;

public class HeapSort {
    
    /*
     * 最小的每次回调到堆顶
     */
    public static void adjustMinHeap(int[] a, int pos, int indexLast) {
        int temp;
        int child;
        for (temp = a[pos]; 2 * pos + 1 <= indexLast; pos = child) {
            child = 2 * pos + 1;
            if (child < indexLast && a[child] > a[child + 1])
                child++;
            if (a[child] < temp)
                a[pos] = a[child];
            else
                break;
        }
        a[pos] = temp;
    }
    
    /*
     * 把堆顶元素放到数组 尾部
     */
    public static void minHeapSort(int[] array) {
        int i;
        int length = array.length;
        for (i = length / 2 - 1; i >= 0; i--)
            adjustMinHeap(array, i , length - 1);
        for (i = length - 1; i >= 0; i--) {
            // 第一个和最后一个交换位置。 然后继续调整
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            adjustMinHeap(array, 0, i - 1);
        }
    }
    
    public static void adjustMaxHeap(int[] a, int pos, int indexLast) {
        int child;
        int temp;
        for (temp = a[pos]; 2 * pos + 1 <= indexLast; pos = child) {
            child = 2 * pos + 1;
            if (child < indexLast && a[child] < a[child + 1])
                child++;
            if (a[child] > temp)
                a[pos] = a[child];
            else
                break;
        }
        a[pos] = temp;
    }
    
    public static void maxHeapSort(int[] array) {
        int i;
        int length = array.length;
        for (i = length / 2 - 1; i >= 0; i--)
            adjustMaxHeap(array, i, length - 1);
        for (i = length -1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            adjustMaxHeap(array, 0, i - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = { 38, 65, 97, 76, 9, 9, 9, 13, 10, 10, 27, 49 };
        minHeapSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        int[] b = { 5, 4, 9, 8, 7, 6, 0, 1, 3, 2 };
        maxHeapSort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
