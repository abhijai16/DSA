package Array;

//* Time Complexity of O(N*2^N) */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubset{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};

        List<List<Integer>> list = subsetWithDuplicates(arr);
        System.out.println(list);
    }


    //* If the array contains duplicate elements like [1, 2, 2] then it will create subset of [1,2] twice with this approach. */
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num:arr){
            int size = outer.size();
            for(int i= 0; i<size; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));

                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    //* This will not contain duplicate subsets. */
    public static List<List<Integer>> subsetWithDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0, end = 0;
        for(int i=0; i<arr.length; i++){
            start = 0;

            if(i>0 && arr[i]==arr[i-1]){
                start = end + 1;
            }
            
            end = outer.size()-1;
            int size = outer.size();

            for(int j=start; j<size; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));

                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
