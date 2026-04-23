package Searching;
import java.util.Scanner;

public class BinarySearchDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {519, 180, 118, 113, 98, 52, 13, 5, 2, 1};

        System.out.print("Enter the target value to check: ");
        int target = sc.nextInt();

        int start = 0 , end = arr.length-1;
        boolean found = false;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target ){
                System.out.println("Target found at Index " + mid);
                found = true;
                break;
            }
            else if(target>arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(!found){
            System.out.println("Target not found.");
        }
        sc.close();
    }
    
}
