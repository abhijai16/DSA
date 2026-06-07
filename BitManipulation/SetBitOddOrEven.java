package BitManipulation;

//* Three Methods using bitCount(), using while loop and using XOR folding technique. */

public class SetBitOddOrEven {
    public static void main(String[] args) {
        int n = 13;

        System.out.println(bitCount(n));
        System.out.println(whileLoop(n));
        System.out.println(xorFolding(n));
    }

    //* By using bitCount(). */
    public static String bitCount(int n){
        int count = Integer.bitCount(n);

        return count%2==0 ? "Even" : "Odd";
    }

    //* By using while loop. */
    public static String whileLoop(int n){
        int count = 0;
        while(n>0){
            n = n&(n-1);
            count++;
        }
        return count%2==0 ? "Even" : "Odd";
    }

    //! Important- Using XOR Folding;
    public static String xorFolding(int n){
        n ^= n>>16;
        n ^= n>>8;
        n ^= n>>4;
        n ^= n>>2;
        n ^= n>>1;
        return (n&1)==1 ? "Odd" : "Even";
    }

    // How this is working:
    // 1^1^1 = 1 (odd gives one)
    // 1^1^1^1 = 0 (even gives zero)
}
