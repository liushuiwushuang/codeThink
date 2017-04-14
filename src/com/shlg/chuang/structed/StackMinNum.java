package com.shlg.chuang.structed;

/*
 * 以O(1)时间求栈中最小值 (用一个栈来维护栈中最小值)
 */
public class StackMinNum {

    MyLinkedStack<Integer> elem;
    
    MyLinkedStack<Integer> min;
    
    public StackMinNum() {
        elem = new MyLinkedStack<Integer>();
        min = new MyLinkedStack<Integer>();
    }
    
    public void push(int data) {
        elem.push(data);
        if (min.isEmpty()) {
            min.push(data);
        } else {
            if (data < min.peek()) {
                min.push(data);
            }
        }
    }
    
    public int pop() {
        int topData = elem.peek();
        elem.pop();
        if (topData == this.peekMin()) {
            min.pop();
        }
        return topData;
    }
    
    public int peekMin() {
        if (min.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return min.peek();
        }
    }
}
