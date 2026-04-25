package Searching;
import java.util.Arrays;

//* The matrix is completely sorted so we can apply binary search with Time Complexity of O(log(m*n)) */

public class Arr2D_SortedSearch {
    public static void main(String[] args) {
        int[][] arr = {
            { 1,  2,  3,  4},
            { 5,  6,  7,  8},
            { 9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int target = 11;

        System.out.println(Arrays.toString(binarySearch(arr, target)));
    }

    public static int[] binarySearch(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)  //Edge Check
            return new int[]{-1, -1};

        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / n;
            int col = mid % n;

            int val = matrix[row][col];

            if (val == target) return new int[]{row, col};
            else if (val < target) low = mid + 1;
            else high = mid - 1;
        }

        return new int[]{-1, -1};
    }
}