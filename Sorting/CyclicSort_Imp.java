package Sorting;
import java.util.*;

//* Only be used when the array is given with elements 1 to n. */
//* It's Time Complexity is O(n). */
//* Important - As many companies ask questions from this sorting pattern. */

public class CyclicSort_Imp {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {5, 2, 3, 6, 7, 1, 4}; //* 1 to n=7 */  // 7, 6, 5, 4, 3, 2, 1

            System.out.println("Ascending(a) or Descending(d): ");
            String type = sc.next();
            
            cyclicSort(arr, type);

            System.out.println(Arrays.toString(arr));
            sc.close();
    }

    public static void cyclicSort(int[] arr, String type){
        int i=0;
        while(i<arr.length){
            if(type.equals("a")){
                if(i != arr[i]-1){
                    swap(arr, i, arr[i]-1);
                }
                else{
                    i++;
                }
            }
            else if(type.equals("d")){
                if(i != arr.length-arr[i]){
                    swap(arr, i, arr.length-arr[i]);
                }
                else{
                    i++;
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
