package com.shlg.chuang.structed;

import java.util.Arrays;

/*
 * 数组实现栈
 */
public class MyArrayStack<E> {

    private Object[] stack;

    private int size;

    public MyArrayStack() {
        stack = new Object[10]; // 初始长度为10
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) stack[size - 1];
    }

    public E pop() {
        E e = peek();
        stack[size - 1] = null;
        size--;
        return e;
    }

    public E push(E item) {
        ensureCapacity(size + 1);
        stack[size++] = item;
        return item;
    }

    private void ensureCapacity(int size) {
        int len = stack.length;
        if (size > len) {
            int newLen = len + 10; // 每次数组扩容
            stack = Arrays.copyOf(stack, newLen);
        }
    }

    public static void main(String[] args) {
        MyArrayStack<Integer> s = new MyArrayStack<Integer>();
        s.push(1);
        s.push(2);
        System.out.println(s.size);
        System.out.println(s.stack.length);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(11);
        s.push(12);
        System.out.println("栈中元素个数：" + s.size);
        System.out.println("栈顶元素为：" + s.pop());
        System.out.println("栈顶元素为：" + s.peek());
    }
}
