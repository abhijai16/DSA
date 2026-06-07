package BitManipulation;

//* 11 is counted as 1 pair,   in 11011 there is 2 pair, in 10101 there is 0 pair */

public class CountSetBitPairs {
    public static void main(String[] args) {
        int n = 27;     //11011   2 pairs

        System.out.println(bitMethod(n));
        System.out.println(stringMethod(n));
    }

    //! Important Method 1 using bit
    public static int bitMethod(int n){
        int pair = n&(n>>1);
        return Integer.bitCount(pair);
    }


    //* Method 2 using string. */
    public static int stringMethod(int n){
        String binary = "";
        while(n>0){
            binary = (n%2) + binary;
            n /= 2;
        }
        int count = 0;
        for(int i=0; i<binary.length()-1; i++){
            if(binary.charAt(i)=='1' && binary.charAt(i+1)=='1'){
                count++;
            }
        }
        return count;
    }
}
