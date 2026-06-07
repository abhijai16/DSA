package BitManipulation;

//* Find the ith bit of a number. */

public class ithBitOfNum {
    public static void main(String[] args) {
        int a = 9; //1001
        int n = 3;

        int ans = a&(1<<n);   // for n=3, 1001 & 0100 => 0000   or  for n=4, 1001 & 1000 => 1000 

        //! Method 2 :
        int ans2 = (a>>n)&1;

        if(ans==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }

        
        if(ans2==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }

    }
}
