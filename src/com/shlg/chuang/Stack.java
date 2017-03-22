package com.shlg.chuang;

public class Stack {
    
    int[] data;
    
    Integer maxSize;
    
    int top;
    
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        data = new int[maxSize];
        top = -1;
    }
    
    public boolean push(int data) {
        if (top + 1 == maxSize) {
            System.out.println("栈已满！");
            return false;
        }
        this.data[++top] = data;
        return true;
    }
    
    public int pop() throws Exception {
        if (top == -1) {
            throw new Exception("栈已空！");
        }
        return this.data[top--];
    }
    
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(1000);
        stack.push(1);
        stack.push(2);
        while (stack.top >= 0) {
            System.out.println(stack.pop());
        }
    }
    
}
