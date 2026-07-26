package no_37_sudoku_solver;

import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args) {
        Solution ss= new Solution();


    }
}

class Solution {
    public void solveSudoku(char[][] board) {


        Sudoku(board);

    }

    boolean Sudoku(char [][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ( board[i][j] =='.' ){
                    for (char c = '1'; c <= '9'; c++) {

                        if (isValid(i,j,c,board)){
                            board[i][j]=c;

                            if (Sudoku(board)){
                                return true;
                            }else {
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;

                }
            }
        }
        return true;

    }


    boolean isValid(int i , int j , char c, char [][] board){
        for (int row = 0; row < 9; row++) {
            if (board[row][j]== c){
                return false;

            }
        }
        for (int col = 0; col < 9; col++) {
            if (board[i][col]==c){
                return false;

            }

        }
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;

        for (int k = startRow; k < startRow + 3; k++) {
            for (int b = startCol; b < startCol + 3; b++) {
                if (board[k][b] == c) return false;
            }
        }

        return true;

    }
//    Inefficient this method to scan in subbox 3by3.bcz this method scan all subbox3by3.
    boolean boxWiseCheck(char [][] board){
        List<Character> checker = new ArrayList<>();
        for (int row = 0; row < 9; row+=3) {
            for (int col = 0; col < 9; col+=3) {
                checker.clear();

                for (int i = row; i <row+3 ; i++) {
                    for (int j = col; j < col+3; j++) {
                        if (board[i][j]!= '.'){
                            if (checker.contains(board[i][j])){
                                return false;

                            }checker.add(board[i][j]);

                        }
                    }
                }
            }
        }

        return true;
    }
}









