package Backtracking;

//* Now we can move in all four direction down, up, right, left. Go from (0,0) to (2,2) */

public class MazeProblemFinal {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        printPath("", maze, 0, 0);
    }    

    public static void printPath(String pathProcessed, boolean[][] maze, int row, int col){
        if(row==2 && col==2){
            System.out.println(pathProcessed);
            return;
        }
        maze[row][col] = false;
        if(row<2 && maze[row+1][col]){
            printPath(pathProcessed + "D", maze, row+1, col);
        }
        
        if(col<2 && maze[row][col+1]){
            printPath(pathProcessed + "R", maze, row, col+1);
        }
        if(row>0 && maze[row-1][col]){
            printPath(pathProcessed + "U", maze, row-1, col);
        }
        if(col>0 && maze[row][col-1]){
            printPath(pathProcessed + "L", maze, row, col-1);
        }

        maze[row][col]=true;
    }
}
