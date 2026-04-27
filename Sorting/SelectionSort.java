package Sorting;
import java.util.*;

//* Selection Sort Time Complexity is O(n^2) and it is not a stable Sorting Algorithm. */

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {76, 23, 1, 0, 25, 11, 90, 20};

        System.out.println("Ascending(a) or Descending(d): ");
        String type = sc.next();

        selectionSort(arr, type);
        
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void selectionSort(int[] arr, String type){
        if(type.equals("a")){
            for(int i=0; i<arr.length; i++){
                int last = arr.length-i-1;
                int max = getMaxIndex(arr, 0, last);
                swap(arr, max, last);
            }
        }
        else if(type.equals("d")){
           for(int i=0; i<arr.length; i++){
                int first = i;
                int max = getMaxIndex(arr, first, arr.length-1);
                swap(arr, max, first);
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //* For Ascending order. */
    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for(int i=start; i<=end; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

}
