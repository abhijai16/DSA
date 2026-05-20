package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 81, 19, 20, 2, 5};
        int target = 20;
        System.out.println(isFound(arr, target, 0)); 
    }

    public static boolean isFound(int[] arr, int target, int start){
        if(start==arr.length){
            return false;
        }
        
        return arr[start]==target || isFound(arr, target, start+1);
    }
}
