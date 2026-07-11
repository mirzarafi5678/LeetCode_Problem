import java.util.ArrayList;

class  Solution {

    boolean rowWiseChecl(char [][] board){
        ArrayList<Character> checker = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {

            checker.clear();
//            char []  row = board[i];
            int j = 0;
            while ( j<board.length){
              if (board[i][j] != '.') {
                  if (!checker.contains(board[i][j])) {
                      checker.add(board[i][j]);
                  } else {
                      return false;
                  }
              }

                j++;



            }
        }

        return true;
    }

    boolean columnWiseCheck(char[][] board){
        ArrayList<Character> checker = new ArrayList<>();
        for (int j = 0; j < board.length; j++) {
            checker.clear();

            for (int i = 0; i <  board.length ; i++) {

              if(board[i][j] != '.'){
                if ( checker.contains(board[i][j])  ){

                    return false;
                }else {
                    checker.add(board[i][j]);

                }
              }
            }
        }


        return true;

    }


   boolean boxWiseCheck(char [][] board){
        ArrayList<Character> checker = new ArrayList<>();
        for (int row = 0; row < 9; row+=3 ) {
           for (int col = 0; col < 9; col+=3) {
               checker.clear();

               for (int i = row; i < row +3; i++) {
                   for (int j = row; j < col+3; j++) {
                       if (board[i][j] !='.'){
                           if (checker.contains(board[i][j])){
                               return false;

                           }
                           checker.add(board[i][j]);


                       }
                   }
               }



           }
       }
        return true;
    }


    public boolean isValidSudoku(char[][] board) {



        return rowWiseChecl(board) && columnWiseCheck(board) && boxWiseCheck(board);



    }
}


public class Main {

    public static void main(String[] args) {

    }
}