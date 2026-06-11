package BitManipulation;

import java.util.ArrayList;

public class ArraySubset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        ArrayList<ArrayList<Integer>> subset = printAllSubsets(arr);
        System.out.println(subset);
    }

    public static ArrayList<ArrayList<Integer>> printAllSubsets(int[] arr) {
        ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<(1<<n); i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++){
                if((i&(1<<j)) != 0){
                    list.add(arr[j]);
                }
            }
            subset.add(list);
        }
        return subset;
    }
}
