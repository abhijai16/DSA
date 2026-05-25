package Backtracking;

import java.util.Arrays;

//* now we have to print a maze with steps like - 
//*   1  2  3       
//*   0  0  4
//*   0  0  5    and more answers, same like this....

public class MazePathWithSteps {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];

        printPath("", maze, 0, 0, path, 1);
    }    

    public static void printPath(String pathProcessed, boolean[][] maze, int row, int col, int[][] path, int step){
        if(row==2 && col==2){
            path[row][col] = step;
            for(int[] num:path){
                System.out.println(Arrays.toString(num));
            }
            System.out.println(pathProcessed);
            System.out.println();
            return;
        }
        maze[row][col] = false;
        path[row][col] = step;
        
        if(row<2 && maze[row+1][col]){
            printPath(pathProcessed + "D", maze, row+1, col, path, step+1);
        }
        
        if(col<2 && maze[row][col+1]){
            printPath(pathProcessed + "R", maze, row, col+1, path, step+1);
        }
        if(row>0 && maze[row-1][col]){
            printPath(pathProcessed + "U", maze, row-1, col, path, step+1);
        }
        if(col>0 && maze[row][col-1]){
            printPath(pathProcessed + "L", maze, row, col-1, path, step+1);
        }

        maze[row][col]=true;
        path[row][col] = 0;
    }
}

