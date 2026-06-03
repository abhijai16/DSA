package Array;

//* Sort a m*2 matrix based on first column and second column. */

import java.util.Arrays;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3},
            {9, 7},
            {4, 1},
            {8, 5}
        };

        System.out.println("Based on first column:");

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for(int[] row:arr){
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        System.out.println("Based on second column:");

        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        for(int[] row:arr){
            System.out.println(Arrays.toString(row));
        }

    }    
}
