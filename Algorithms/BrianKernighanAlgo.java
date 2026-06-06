package Algorithms;

//* Use to calculate the total number of set bit in a number. */

public class BrianKernighanAlgo {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(countSetBits(n));
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n>0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}

