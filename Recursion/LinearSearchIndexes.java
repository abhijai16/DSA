package Recursion;

import java.util.ArrayList;

public class LinearSearchIndexes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 3, 4, 8, 10, 4};
        int target = 4;

        System.out.println( Search(arr, target, 0));
    }

    static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<Integer> Search(int[] arr, int target, int start){
        if(start == arr.length){
            return list;
        }
        else if(arr[start] == target){
            list.add(start);
        }
        return Search(arr, target, start+1); 
    }
}
