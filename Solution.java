package com.bsc.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    List<String> ans = new ArrayList<>();
    Set<String> set = new HashSet<>();
    boolean[][] vis = new boolean[15][15];
    int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    char[][] board;
    int m;
    int n;
    public List<String> findWords(char[][] board, String[] words) {
        board = board;
        m = board.length;
        n = board[0].length;
        StringBuilder sb = new StringBuilder();
        for(String word:words){
            set.add(word);
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                vis[i][j] = true;
                sb.append(board[i][j]);
                dif(i,j,sb);
                vis[i][j] = false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return ans;
    }
    private void dif(int i,int j,StringBuilder sb){
        if(sb.length()>10) return;
        if(set.contains(sb.toString())){
            ans.add(sb.toString());
            set.remove(sb.toString());
        }
        for(int[] d:dirs){
            int dx = i+ d[0];
            int dy = j +d[1];
            if(dx<0||dx>=m||dy<0||dy>=n) continue;
            if(vis[dx][dy]) continue;
            vis[dx][dy] = true;
            sb.append(board[dx][dy]);
            dif(dx,dy,sb);
            vis[dx][dy] = false;
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
