package com.shlg.chuang.structed;

import java.util.HashSet;
import java.util.Set;

public class MyLinkedList {

    Node<Integer> head = null;
    
    public void addNode(int d) {
        Node<Integer> newNode = new Node<Integer>(d);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<Integer> tmp = head;
        // 尾插法
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }
    
    /*
     * 删除第 i 个节点
     */
    public Boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 2;
        Node<Integer> preNode = head;
        Node<Integer> curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            i++;
            preNode = curNode;
            curNode = curNode.next;
        }
        return true;
    }
    
    /*
     * 删除指定节点 
     */
    public boolean deleteNode(Node<Integer> node) {
        // 判断如果是空节点不可删，如果是尾节点也不可删(因为删除后无法使其前驱结点的 next指针置为空)
        if (node == null || node.next == null) 
            return false;
        node.data = node.next.data;
        node.next = node.next.next;
        return true;
    }
    
    /*
     * 从单链表中找倒数第 K 个元素  (采用双指针,遍历一遍就行)
     */
    public Node<Integer> findLastK(Node<Integer> h, int k) {
        if (k < 1) return null;
        Node<Integer> p1 = h; 
        Node<Integer> p2 = h;
        
        // 让p1 指向第k 个节点
        for (int i = 0; i < k - 1 && p1 != null; i++) {
            p1 = p1.next;
        }
        if (p1 == null) {
            System.out.println("链表长度小于 K");
            return null;
        }
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
    
    /*
     * 快慢指针找中间节点  (只需遍历一次)
     */
    public Node<Integer> searchMid(Node<Integer> h) {
        Node<Integer> p = h;
        Node<Integer> q = h;
        while (p != null && p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        return q;
    }
    
    /*
     * 空间换时间
     */
    public void deleteDuplecate1(Node<Integer> h) {
        Set<Integer> set = new HashSet<>();
        Node<Integer> tmp = h;
        Node<Integer> pre = null;
        while (tmp != null) {
            if (set.contains(tmp.data)){
                pre.next = tmp.next;
            } else {
                set.add(tmp.data);
                pre = tmp;
            }
            tmp = tmp.next;
        }
    }
    
    /*
     * 进行双重循环遍历
     */
    public void deleteDuplecate2(Node<Integer> h) {
        Node<Integer> p = h;
        while (p != null) {
            Node<Integer> q = p;
            while (q.next != null) {
                if (p.data == q.next.data) {
                    q.next = q.next.next;
                } else {
                    q = q.next;
                }
            }
            p = p.next;
        }
    }
    
    public int length() {
        int length = 0;
        Node<Integer> tmp = head;
        while (tmp != null) {
            length ++;
            tmp = tmp.next;
        }
        return length;
    }
    
    /*
     * 对链表排序, 返回排序后的头节点 (这里使用了插入排序)
     */
    public Node<Integer> orderList() {
        Node<Integer> nextNode = null;
        int temp = 0;
        Node<Integer> curNode = head;
        // 插入排序
        while (curNode.next != null) {
            // 每趟排序找最小值放到curNode 指向的位置
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data > nextNode.data) {
                    // 交换内容
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }
    
    /*
     * 判断俩个链表是否相交 (只要判断尾节点是否相同)
     */
    public boolean isIntersect(Node<Integer> h1, Node<Integer> h2) {
        if (h1 == null || h2 == null) {
            return false;
        }
        Node<Integer> tail1 = h1;
        while (tail1.next != null) {
            tail1 = tail1.next;
        }
        Node<Integer> tail2 = h2;
        while (tail2.next != null) {
            tail2 = tail2.next;
        }
        return tail1 == tail2;
    }
    
    
    public void printList() {
        Node<Integer> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
    
    public void printListReverse(Node<Integer> pListHead) {
        if (pListHead != null) {
            printListReverse(pListHead.next);
            System.out.print(pListHead.data + " ");
        }
    }
    
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(3);
        System.out.println("listLen = " + list.length());
        System.out.println("before order:");
        list.printList();
        
        System.out.println("after order");
        list.orderList();
        list.printList();
        
        System.out.println("print Reverse list");
        list.printListReverse(list.head);
        System.out.println();
        
        // 去重
        System.out.println("去重");
        MyLinkedList list0 = new MyLinkedList();
        list0.addNode(5);
        list0.addNode(3);
        list0.addNode(1);
        list0.addNode(3);
        list0.deleteDuplecate1(list0.head);
        list0.printList();
//        LinkedList
    }
}
