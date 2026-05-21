package Recursion;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;

        pattern(n, n);
    }

    public static void pattern(int row, int col){
        if(row==0){
            return;
        }
        if(col>0){
            System.out.print("*");
            pattern(row, col-1);
        }
        else{
            System.out.println();
            pattern(row-1, row-1);
        }
    }
}