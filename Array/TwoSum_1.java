package Array;

//Brute Force Method with Time Complexity = O(n^2).

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] arr = {2, 11, 5, 9, 7, 1, 10, 8, 13, 4, 0};
        int target = 9;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
