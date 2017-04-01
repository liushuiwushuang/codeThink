package com.shlg.chuang.sort;

public class BucketSort {
    
    class Node {
        int key;
        Node next;
    }
    
    void incSort(int[] keys, int bucketSize) {
        int size = keys.length;
        Node[] bucket_table = new Node[bucketSize];
        for (int i = 0; i < bucketSize; i++) {
            bucket_table[i] = new Node();
            bucket_table[i].key = 0;    //记录当前桶中的数据量
            bucket_table[i].next = null;
        }
        for (int j = 0; j < size; j++) {
            Node node = new Node();
            node.key = keys[j];
            node.next = null;
            int index = keys[j] / 10;
            Node p = bucket_table[index];
            if (p.key == 0) {
                bucket_table[index].next = node;
                (bucket_table[index].key) ++;
            } else {
                // 链表结构的插入排序
                while (p.next != null && p.next.key <= node.key)
                    p = p.next;
                node.next = p.next;
                p.next = node;
                (bucket_table[index].key) ++;
            }
        }
        for (int b= 0; b < bucketSize; b++) {
            for (Node k = bucket_table[b].next; k != null; k = k.next)
                System.out.print(k.key + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = { 49, 38, 65, 97, 76, 13, 27, 49 };
        new BucketSort().incSort(array, 10);
    }

}
