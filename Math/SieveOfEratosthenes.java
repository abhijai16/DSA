package Math;

public class SieveOfEratosthenes{
    public static void main(String[] args) {
        int n = 100;
        boolean[] prime = new boolean[n+1];  //by default all values are false.
        sieve(n, prime);
    }

    //* If any index contains false, i.e. Prime. */
    public static void sieve(int target, boolean[] prime){
        for(int i=2; i<=Math.sqrt(target); i++){
            if(!prime[i]){
                for(int j=i*2; j<=target; j += i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2; i<=target; i++){
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}