package Searching;

//* Ceiling means smallest element greater or equal to the target. */

import java.util.Scanner;


public class CeilingOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 18};

        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        sc.close();

        int start = 0, end = arr.length-1;
        boolean found = false;

        if(target>arr[end]){
            System.err.println("No Ceiling Element Exist!");
            return;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==target){
                System.out.println(arr[mid]);
                found = true;
                break;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(!found){
            System.out.println(arr[start]);
        }
    }
}