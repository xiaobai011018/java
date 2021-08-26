package com.bsc.leetcode;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isValidSudoku2(char[][] board) {
        
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j]!=','){
                    int num = board[i][j] - '1';
                    int boxIndex = (i/3)*3+ j/3;
                    if(row[i][num]||col[j][num]||box[boxIndex][num]){
                        return false;
                    }
                    row[i][num] = true;
                    col[j][num] = true;
                    box[boxIndex][num] = true;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku1(char[][] board) {
        Map<Character,Integer> colMap = new HashMap<>();
        Map<Character,Integer> rowMap = new HashMap<>();
//        colMap.put(colMap.get)
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(rowMap.containsKey(board[i][j])){
                    return false;
                }else{
                    rowMap.put(board[i][j],0);
                }
            }
        }
        for(int i = 0;i<board[0].length;i++){
            for(int j = 0;j<board.length;j++){
                if(colMap.containsKey(board[j][i])){
                    return false;
                }else{
                    colMap.put(board[j][i],0);
                }
            }
        }
        for(int i = 0;i<board.length;i += 3){
            for(int j = 0;j<board[i].length;j += 3){
                if(!check(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean check(char[][] board,int col,int row){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = row;i<row+3;i++){
            for(int j = col;j<col+3;j++){
                if(map.containsKey(board[i][j])){
                    return false;
                }else{
                    map.put(board[i][j],0);
                }
            }
        }
        return true;
    }
}
