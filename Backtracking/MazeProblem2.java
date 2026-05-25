package Backtracking;

//* Now we have to print the path to go from (3,3) to (1,1). */

public class MazeProblem2 {
    public static void main(String[] args) {
        printPath("", 3, 3);
    }   
    
    public static void printPath(String pathProcessed, int row, int col){
        if(row==1 && col==1){
            System.out.println(pathProcessed);
            return;
        }
        // Move Down
        if(row > 1){
            printPath(pathProcessed + "D", row-1, col);
        }
        // Move Right
        if(col > 1){
            printPath(pathProcessed + "R", row, col-1);
        }
        
    }
}
