package com.shlg.chuang.structed;

public class BinarySeekPostOrder {
    
    private TreeNode root;
    
    public BinarySeekPostOrder() {
        root = null;
    }
    
    public void initTree(int[] preOrder, int[] midOrder) {
        this.root = this.initTree(preOrder, 0, preOrder.length - 1, 
                midOrder, 0, midOrder.length - 1);
    }
    
    public TreeNode initTree(int[] preOrder, int start1, int end1, 
            int[] midOrder, int start2, int end2) {
        if (start1 > end1 || start2 > end2) {
            return null;
        }
        int rootData = preOrder[start1];
        TreeNode head = new TreeNode(rootData);
        // 找到根节点所在的位置
        int rootIndex = findIndexInMidArray(midOrder, rootData, start2, end2);
        int offSet = rootIndex - start2 - 1;
        
        // 构建左子树
        TreeNode leftNode = initTree(preOrder, start1 + 1, start1 + 1 + offSet, 
                midOrder, start2, start2 + offSet);
        
        // 构建右子树
        TreeNode rightNode = initTree(preOrder, start1 + offSet + 2, end1, 
                midOrder, rootIndex + 1, end2);
        head.left = leftNode;
        head.right = rightNode;
        return head;
    }
    
    private int findIndexInMidArray(int[] a, int x, int begin, int end) {
        for (int i = begin; i <= end; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /*
     * 后序遍历实现
     */
    public void postOrder(TreeNode current) {
        if (current != null) {
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.data + " ");
        }
    }

    public static void main(String[] args) {
        BinarySeekPostOrder biTree = new BinarySeekPostOrder();
        int[] preOrder = { 1, 2, 4, 8, 9, 5, 10, 3, 6, 7 };
        int[] midOrder = { 8, 4, 9, 2, 10, 5, 1, 6, 3, 7 };
        biTree.initTree(preOrder, midOrder);
        System.out.println("二叉树的后序遍历：");
        biTree.postOrder(biTree.root);
        System.out.println();
    }

}
