package Searching;
import java.util.*;

//* The given array is not sorted therefore searching will take Time Complexity of O(n^2) */

public class Arr2D_Search1 {
    public static void main(String[] args) {
        int[][] arr = {
            {12, 14, 97, 18},
            {10, 99, 82, 13},
            {19, 23, 55, 47},
            {13, 29, 22, 20}
        };
        int target = 55;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int[] search(int[][] array, int target){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
