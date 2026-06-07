package BitManipulation;

//* Use to calculate the total number of set bit in a number. */

public class BrianKernighanAlgo {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(countSetBits(n));

        System.out.println(trick(n));
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n>0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    //! Integer Built in function.
    public static int trick(int n){
        return Integer.bitCount(n);
    }

}



