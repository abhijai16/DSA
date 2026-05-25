package Backtracking;

//* We have to go from (0,0) to (2,2) but the catch is that at (1,1) a big rock is placed, so we cannot go over here. */

public class MazeWithObstacles {
    public static void main(String[] args) {
        pathWithObstacles("", 0, 0, 1, 1);
    }
    
    public  static void pathWithObstacles(String pathProcessed, int row, int col, int rockRow, int rockCol){
        if(row == rockRow && col == rockCol){
            return;
        }
        if(row == 2 && col == 2){
            System.out.println(pathProcessed);
            return;
        }

        if(row<2){
            pathWithObstacles(pathProcessed + "D", row+1, col, rockRow, rockCol);
        }
        if(col<2){
            pathWithObstacles(pathProcessed + "R", row, col+1, rockRow, rockCol);
        }
        if(row<2 && col<2){
            pathWithObstacles(pathProcessed + "d", row+1, col+1, rockRow, rockCol);
        }
    }
}
