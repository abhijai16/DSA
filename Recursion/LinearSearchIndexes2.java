package Recursion;

import java.util.ArrayList;

public class LinearSearchIndexes2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 6, 4, 7, 8, 9, 4};
        int target = 4;
        
        System.out.println(Search(arr, target, 0, new ArrayList<>()));
        System.out.println(Search2(arr, target, 0));
    }


    //* ArrayList in arguments. */
    public static ArrayList<Integer> Search(int[] arr, int target, int start, ArrayList<Integer> list){
        if(start==arr.length){
            return list;
        }
        else if(arr[start]==target){
            list.add(start);
        }
        return Search(arr, target, start+1, list);
    }

    //* Arraylist in the body and not in the argument, i.e. each call will create a new arraylist */
    public static ArrayList<Integer> Search2(int[] arr, int target, int start){
        ArrayList<Integer> list = new ArrayList<>();
        if(start==arr.length){
            return list;
        }
        else if(arr[start]==target){
            list.add(start);
        }
        ArrayList<Integer> ansFromBelowCalls = Search2(arr, target, start+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
