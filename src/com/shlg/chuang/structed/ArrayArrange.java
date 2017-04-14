package com.shlg.chuang.structed;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayArrange {
    
    private int[] numbers = new int[] { 1, 2, 2, 3, 4, 5 };
    
    private int n = numbers.length;
    
    // 标记图中结点是否被遍历过
    private boolean[] visited = new boolean[n];
    
    // 图的二维数组表示
    private int[][] graph = new int[n][n];
    
    // 数字组合
    private String combination = "";
    
    public Set<String> getAllCombinations() {
        // 构造图
        buildGraph();
        // 用来存放所有组合
        Set<String> set = new HashSet<String>();
        // 分别从不同的结点出发深度遍历图
        for (int i = 0; i < n; i++) {
            this.depthFirstSearch(i, set);
        }
        return set;
    }

    private void buildGraph() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = 1;
                }
            }
        }
        // 确保遍历时3 与 5是不可达的
        graph[3][5] = 0;
        graph[5][3] = 0;
    }
    
    // 从结点srart 位置进行深度遍历
    private void depthFirstSearch(int start, Set<String> set) {
        visited[start] = true;
        combination = combination + numbers[start];
        if (combination.length() == n) {
            // 4 不出现在第三个位置
            if (combination.indexOf("4") != 2)
                set.add(combination);
        }
        for (int j = 0; j < n; j++) {
            if (graph[start][j] == 1 && visited[j] == false)
                depthFirstSearch(j, set);
        }
        combination = combination.substring(0, combination.length() - 1);
        visited[start] = false;
    }
    
    public static void main(String[] args) {
        ArrayArrange arrange = new ArrayArrange();
        Set<String> set = arrange.getAllCombinations();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }
    }

}
