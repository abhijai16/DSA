package BitManipulation;

//* Check if a number is power of two or not. */

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 16;

        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n){
        return n>0 && (n&(n-1))==0;
    }
}
