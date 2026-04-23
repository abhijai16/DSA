package Searching;
//* Therefore we dont know the length of an array */

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10, 14, 15, 19, 20, 51, 86, 110, 213, 389, 512, 759, 1000, 1221, 1222, 1800, 2222, 2500, 2897, 3000, 3223, 3598, 4230};
        //* We can't use arr.length
        int target = 86;

        int index = range(arr, target);
        System.out.println(index);
    }

    public static int range(int[] arr, int target){
        int start=0, end=1;

        while(target>arr[end]){
            int newstart = end+1;
            end = end + ((end - start + 1) * 2);    //* Expanding the range twice to find the range */
            start = newstart;
        }
        int index = binarysearch(arr, target, start, end);
        return index;
    }

    public static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
