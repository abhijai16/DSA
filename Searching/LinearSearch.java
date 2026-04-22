package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 4, 7, 11, 98, 2, 3, 8, 80, 119};

        System.out.print("Enter the target value to check: ");
        int target = sc.nextInt();

        //*Linear Search with Time Complexity O(n).
        for(int i=0; i<arr.length; i++){
            if(arr.length==0){
                System.out.println("Not Found!");
            }
            else{
                if(arr[i]==target){
                    System.out.println("Element Found at Index " + i + ".");
                }
            }
        }
        sc.close();
    }
    
}
