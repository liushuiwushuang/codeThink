package com.shlg.chuang.structed;

/*
 * 俩个栈实现一个队列
 */
public class TwoStackImpleQueue<E> {

    private MyLinkedStack<E> s1 = new MyLinkedStack<E>();
    private MyLinkedStack<E> s2 = new MyLinkedStack<E>();
    
    public synchronized void put(E e) {
        s1.push(e);
    }
    
    public synchronized E pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        return s2.pop();
    }
    
    public synchronized boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    
    public static void main(String[] args) {
        TwoStackImpleQueue<Integer> q = new TwoStackImpleQueue<Integer>();
        q.put(1);
        q.put(2);
        System.out.println("队列的首元素:" + q.pop());
        System.out.println("队列的首元素:" + q.pop());
    }
}
