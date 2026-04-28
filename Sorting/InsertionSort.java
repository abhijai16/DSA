package Sorting;
import java.util.*;

//* Insertion Sort Time Complexity is O(n^2) and is stable Sorting Algorithm. */

public class InsertionSort {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {76, 23, 1, 0, 25, 11, 90, 20};

        System.out.println("Ascending(a) or Descending(d): ");
        String type = sc.next();

        insertionSort(arr, type);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void insertionSort(int[] arr, String type){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            if(type.equals("a")){
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
            }
            else if(type.equals("d")){
                while(j>=0 && arr[j]<key){
                    arr[j+1]=arr[j];
                    j--;
                }
            }
            arr[j+1]=key;
        }
    }
}
