import java.util.ArrayList;

class  Solution {
    public boolean isValidSudoku(char[][] board) {

        ArrayList<Character> checker = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            checker.clear();
//            char []  row = board[i];
            int j = 0;
            while ( j<9){

                if (!checker.contains(board[i][j])) {
                    checker.add(board[i][j]);
                }
                else {
                    return false;
                }

                j++;


            }


            

        }

        for (int i = 0; i < 9; i++) {
            checker.clear();
            int j =0 ;
            while (j <9){

                checker.add(board[i][j])
                j++;


            }

        }




        return true;
    }
}


public class Main {

    public static void main(String[] args) {

    }
}