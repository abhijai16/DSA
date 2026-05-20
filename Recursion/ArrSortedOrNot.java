package Recursion;

public class ArrSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 11, 19, 24, 35, 84};

        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int[] arr, int start){
        if(start == arr.length-1){
            return true;
        }
        
        return arr[start]<=arr[start+1] && isSorted(arr, start+1);
    }
}
