package com.shlg.chuang.structed;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySortTree {
    
    private TreeNode root;
    
    public BinarySortTree() {
        root = null;
    }
    
    /*
     * 将 data 插入到二叉排序树中
     */
    public void insert(int data) {
        TreeNode newTreeNode = new TreeNode(data);
        if (root == null)
            root = newTreeNode;
        else {
            TreeNode current = root;
            TreeNode parent;
            while (true) { // 寻找插入位置
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newTreeNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newTreeNode;
                        return;
                    }
                }
            }
        }
    }
    
    public void buildTree(int[] data) {
        for (int i = 0; i < data.length; i++) {
            insert(data[i]);
        }
    }
    
    /*
     * 先序遍历
     */
    public void preOrder(TreeNode current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preOrder(current.left);
            preOrder(current.right);
        }
    }
    
    /*
     * 中序遍历
     */
    public void midOrder(TreeNode current) {
        if (current != null) {
            midOrder(current.left);
            System.out.print(current.data + " ");
            midOrder(current.right);
        }
    }
    
    /*
     * 后序遍历
     */
    public void postOrder(TreeNode current) {
        if (current != null) {
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.data + " ");
        }
    }
    
    /*
     * 层次遍历
     */
    public void layerOrder(TreeNode current) {
        if (current == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(current);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }
    
    private int max(int a, int b) {
        return a > b ? a : b;
    }
    
    /*
     * 树的高度
     */
    public int treeHigh(TreeNode current) {
        if (current == null) {
            return 0;
        } else {
            return max(treeHigh(current.left), treeHigh(current.right)) + 1;
        }
    }
    
    public static void main(String[] args) {
        BinarySortTree binarySortTree = new BinarySortTree();
        int[] data = { 2, 8, 7, 4, 9, 3, 1, 6, 7, 5 };
        binarySortTree.buildTree(data);
        System.out.println("中序遍历：");
        binarySortTree.midOrder(binarySortTree.root);
        System.out.println();
        
        System.out.println("先序遍历：");
        binarySortTree.preOrder(binarySortTree.root);
        System.out.println();
        
        System.out.println("后续遍历：");
        binarySortTree.postOrder(binarySortTree.root);
        System.out.println();
        
        System.out.println("层次遍历：");
        binarySortTree.layerOrder(binarySortTree.root);
        System.out.println();
        
        System.out.println("树的高度：");
        System.out.println(binarySortTree.treeHigh(binarySortTree.root));
        
        System.out.println("二叉树结点最大距离:");
        System.out.println(binarySortTree.treeHigh(binarySortTree.root.left) + 
                binarySortTree.treeHigh(binarySortTree.root.right));
    }

}

class TreeNode {
    
    public int data;
    
    public TreeNode left;
    
    public TreeNode right;
    
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
}
