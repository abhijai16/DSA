package BitManipulation;

//* If ith bit is 1 turn it off(0) , if it is 0 turn it on(1). */

public class ithBitOnOff {
    public static void main(String[] args) {
        int n = 27;  // 11011
        int i = 2;   // turn it on
        int j = 1;   // turn it off
        
        n = n|(1<<i); //it will turn it on 11111
        n = n&~(1<<j); //it will turn it off 11101

        System.out.println(n);
    }
}
