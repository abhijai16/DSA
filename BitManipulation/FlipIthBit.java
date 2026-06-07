package BitManipulation;

//* If ith bit is 0 flip to 1, if 1 flip to 0. */

public class FlipIthBit {
    public static void main(String[] args) {
        int n = 27;     //11011
        int i = 2;
        int j = 1;

        n = n^(1<<i);   //11111
        n = n^(1<<j);   //11101
        System.out.println(n);
    }
}
