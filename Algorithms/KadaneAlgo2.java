package Algorithms;

import java.util.Arrays;

//* If we have to print the subarray with maxSum. */

public class KadaneAlgo2 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


        int maxSum = arr[0];
        int currentSum = arr[0];
        int start = 0, end = 0;   
        int tempStart = 0;          

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > currentSum + arr[i]){
                currentSum = arr[i];
                tempStart = i;
            } 
            else {
                currentSum = currentSum + arr[i];
            }

            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;  
                end = i;            
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end+1)));

    }
}
