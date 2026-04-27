package Sorting;
import java.util.*;

//* Bubble Sort Time Complexity is O(n^2) and it is a stable Sorting Algorithm.*/

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {76, 23, 1, 0, 25, 11, 90, 20};

        System.out.println("Ascending(a) or Descending(d): ");
        String type = sc.next();
        bubbleSort(arr, type);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void  bubbleSort(int[] arr, String type){

        for(int i=0; i<arr.length; i++){
            boolean swapped = false;

            for(int j=1; j<arr.length-i; j++){
                if(type.equals("a")){
                    if(arr[j]<arr[j-1]){
                        swap(arr, j, j-1);
                        swapped = true;
                    }
                }
                else if(type.equals("d")){
                    if(arr[j]>arr[j-1]){
                        swap(arr, j, j-1);
                        swapped = true;
                    }
                }
            }
                //* Array is already Sorted, no need to run the loop again and again. */
            if(!swapped){
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

