package Backtracking;

public class N_Knights {
    public static void main(String[] args) {
        int n = 8; //* Number of Knights to be placed. */

        boolean[][] board = new boolean[4][4];

        Knights(board, 0, 0, n);
    }

    public static void Knights(boolean[][] board, int row, int col, int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length){
            return;
        }

        if(col == board.length){
            Knights(board, row+1, 0, knights);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;

            Knights(board, row, col+1, knights-1);

            board[row][col] = false;
        }

        Knights(board, row, col+1, knights);
    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        if(positionValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(positionValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(positionValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(positionValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        return true;
    }

    public static boolean positionValid(boolean[][] board, int row, int col){
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    public static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("N ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
