package Array;
import java.util.HashMap;

//Optimal Approach by using HashMap with Time Complexity of O(n).

public class TwoSum_2 {
    public static void main(String[] args) {
        int[] arr = {2, 11, 5, 9, 7, 1, 10, 8, 13, 4, 0};
        int target = 9;

        HashMap<Integer, Integer> map = new  HashMap<>();

        for(int i = 0; i<arr.length; i++){
            int complement = target-arr[i];

            if(map.containsKey(complement)){
                System.out.println("["+map.get(complement)+","+i+"]");
            }
            else{
                map.put(arr[i], i);
            }
        }
    }
}
