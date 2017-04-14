package com.shlg.chuang.structed;

public class Node<E> {

    E data;
    
    Node<E> next = null;
    
    public Node(E data) {
        this.data = data;
    }
}
