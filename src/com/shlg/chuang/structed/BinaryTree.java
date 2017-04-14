package com.shlg.chuang.structed;

public class BinaryTree {
    
    private Node root;
    
    private int maxLen = 0;
    
    private int max(int a, int b) {
        return a > b ? a : b;
    }
    
    public void build(int[] datas) {
        for (int i = 0; i < datas.length; i++) {
            insert(datas[i]);
        }
    }
    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            Node p = current;
            if (data < current.data) {
                current = current.left;
                if (current == null) {
                    p.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    p.right = newNode;
                    return;
                }
            }
            
        }
    }
    
    public void midOrder(Node current) {
        if (current != null) {
            midOrder(current.left);
            System.out.print(current.data + " ");
            midOrder(current.right);
        }
    }
    
    public void findMaxDistance(Node current) {
        if (current == null) {
            return;
        }
        if (current.left == null) {
            current.leftMaxDistance = 0;
        }
        if (current.right == null) {
            current.rightMaxDistance = 0;
        }
        if (current.left != null) {
            findMaxDistance(current.left);
        }
        if (current.right != null) {
            findMaxDistance(current.right);
        }
        if (current.left != null) {
            current.leftMaxDistance = max(current.left.leftMaxDistance, current.left.rightMaxDistance) + 1;
        }
        if (current.right != null) {
            current.rightMaxDistance = max(current.right.rightMaxDistance, current.right.rightMaxDistance) + 1;
        }
        if (current.leftMaxDistance + current.rightMaxDistance > maxLen) {
            maxLen = current.leftMaxDistance + current.rightMaxDistance;
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        int[] datas = { 7, 5, 9, 3, 2, 1, 10, 4};
        binaryTree.build(datas);
        System.out.println("中序遍历为：");
        binaryTree.midOrder(binaryTree.root);
        System.out.println();
        System.out.println("二叉树结点最大距离:");
        binaryTree.findMaxDistance(binaryTree.root);
        System.out.println(binaryTree.maxLen);
    }
    
    class Node {
        
        public int data;
        
        public Node left;
        
        public Node right;
        
        public int leftMaxDistance;
        
        public int rightMaxDistance;
        
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
        
    }

}
