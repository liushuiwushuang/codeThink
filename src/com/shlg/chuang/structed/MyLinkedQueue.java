package com.shlg.chuang.structed;

public class MyLinkedQueue<E> {

    private Node<E> head = null;
    
    private Node<E> tail = null;
    
    public synchronized boolean isEmpty() {
        return head == tail;
    }
    
    public synchronized void put(E data) {
        Node<E> newNode = new Node<E>(data);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            // 尾插法。这里因为 tail指向尾节点，所以不用遍历链表
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public synchronized E pop() {
        if (this.isEmpty()) {
            return null;
        }
        E data = head.data;
        head = head.next;
        return data;
    }
    
    public synchronized int size() {
        Node<E> tmp = head;
        int n = 0;
        while (tmp != null) {
            n++;
            tmp = tmp.next;
        }
        return n;
    }
    
    public static void main(String[] args) {
        MyLinkedQueue<Integer> q = new MyLinkedQueue<Integer>();
        q.put(1);
        q.put(2);
        q.put(3);
        System.out.println("队列长度为：" + q.size());
        System.out.println("队列首元素" + q.pop());
    }
}
