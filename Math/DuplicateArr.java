package Math;

//* An array contain all the elements twice except one element, find the element. */


public class DuplicateArr {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 6, 4, 1, 2, 5, 3, 3};  // 6 is the answer.
        int ans = 0;

        for(int i=0; i<arr.length; i++){
            ans = ans^arr[i];
        }

        System.out.println(ans);
    }
}

// a^a=0   =>   2^2 = 0 , all the duplicates becomes 0 at last 0^6 left and it give 6.
// a^0=a   =>   0^6 = 6
// a^1=a'
