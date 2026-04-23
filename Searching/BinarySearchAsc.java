package Searching;
import java.util.Scanner;

public class BinarySearchAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 7, 11, 98, 113, 118, 180, 519};

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
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(!found){
            System.out.println("Target not found.");
        }
        sc.close();
    }
    
}
