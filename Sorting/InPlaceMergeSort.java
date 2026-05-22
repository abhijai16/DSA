package Sorting;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 8, 3, 4, 2, 12, 13, 14, 9, 7};

        mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }   

    public static void mergeSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;

        mergeSort(arr, 0, mid);
        mergeSort(arr, mid+1, end);

        merge(arr, start, mid, end);
        
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int left = start;
        int right = mid+1;

        if(arr[mid]<=arr[right]){
            return;
        }

        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                left++;
            }
            else{

                int value = arr[right];
                int index = right;

                while(index > left){
                    arr[index] = arr[index - 1];
                    index--;
                }

                arr[left] = value;

                left++;
                mid++;
                right++;
            }
        }
    }
}
