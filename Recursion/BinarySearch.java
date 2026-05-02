package Recursion;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 7, 11, 98, 113, 118, 180, 519};

        System.out.print("Enter the target value to check: ");
        int target = sc.nextInt();

        System.out.println(binarySearch(arr, target, 0, arr.length-1));

    }

    public static int binarySearch(int[] arr,int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearch(arr, target, start, mid-1);
        }
        else{
            return binarySearch(arr, target, mid+1, end);
        }
    }
}
