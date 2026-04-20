package Array;

//Good than Brute Force Method with Time Complexity of O(n).

public class TwoSum_2 {
    public static void main(String[] args) {
        int[] arr = {2, 11, 5, 9, 7, 1, 10, 8, 13, 4, 0};
        int target = 9;

        int i=0;
        if(arr[i]>target){
            i++;
        }
        else{
            int search = target-arr[i];

            for(int j=i+1; j<arr.length; j++){
                if(arr[j]==search){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
