package Backtracking;

//* Count  no of possible way to go from (3,3) to (1,1) , the catch is person can only go either down or right. */

public class MazeProblem1{
    public static void main(String[] args) {
        System.out.println(countPath(3, 3));
    }

    public static int countPath(int row, int col){
        if(row==1 || col==1){
            return 1;
        }

        int leftAns = countPath(row-1, col);
        int rightAns = countPath(row, col-1);

        return leftAns+rightAns;
    }
}