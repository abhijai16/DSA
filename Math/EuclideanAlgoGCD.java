package Math;

public class EuclideanAlgoGCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 24;

        System.out.println(gcd(a, b));
    }

    public  static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}
