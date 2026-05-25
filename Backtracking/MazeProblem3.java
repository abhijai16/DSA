package Backtracking;

//* Now we can move down(D), right(R) and diagonal(d) too. */

public class MazeProblem3 {
    public static void main(String[] args) {
        printPath("", 3, 3);
    }   
    
    public static void printPath(String pathProcessed, int row, int col){
        if(row==1 && col==1){
            System.out.println(pathProcessed);
            return;
        }
        if(row>1){
            printPath(pathProcessed + "D", row-1, col);
        }
        if(col>1){
            printPath(pathProcessed + "R", row, col-1);
        }
        if(col>1 && row>1){
            printPath(pathProcessed + "d", row-1, col-1);
        }
    }
}
