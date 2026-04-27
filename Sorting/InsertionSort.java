package Sorting;
import java.util.*;

//* Insertion Sort Time Complexity is O(n^2)  */

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
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(type.equals("a")){
                    if(arr[j]<arr[j-1]){
                        swap(arr, j, j-1);
                    }
                    else{
                        break;
                    }
                }
                else if(type.equals("d")){
                    if(arr[j]>arr[j-1]){
                        swap(arr, j, j-1);
                    }
                    else{
                        break;
                    }
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
