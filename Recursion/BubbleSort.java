package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 10, 22, 3, 2, 5, 8};

        Sort(arr, 1, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr, int start, int end){
        if(end == 0 ){
            return;
        }
        if(start>end){
            Sort(arr, 1, end-1);
            return;
        }

        if(arr[start]<arr[start-1]){
            int temp = arr[start];
            arr[start] = arr[start-1];
            arr[start-1] = temp;
        }
    
        Sort(arr, start+1, end);

    }
}
