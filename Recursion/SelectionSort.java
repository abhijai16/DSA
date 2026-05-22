package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 8, 2, 3, 7, 9, 4, 5};

        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end){
        if(end == 0){
            return;
        }
        int maxedIndex = getMaxedIndex(arr, start, end);
        Swap(arr, maxedIndex, end);

        sort(arr, start, end-1);
    }

    public static int getMaxedIndex(int[] arr, int start, int end){
        int maxIndex = start;
        for(int i=start; i<=end; i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void Swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
