package Searching;
import java.util.Arrays;

//* The given array is sorted row wise and column wise therefore searching will take Time Complexity of O(m+n) */

public class Arr2D_Search2 {
    public static void main(String[] args) {
        int[][] arr = {
            {12, 14, 20, 30},
            {24, 26, 29, 35},
            {34, 38, 47, 49},
            {44, 58, 69, 80}
        };
        int target = 38;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int[] search(int[][] array, int target){
        int row = 0, col = array.length-1;
        while(row<array.length && col>=0){
            if(array[row][col]==target){
                return new int[]{row, col};
            }
            else if(array[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }

        return new int[]{-1, -1};
    }
}