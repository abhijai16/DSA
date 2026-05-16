package Math;

public class LCM {
    public static void main(String[] args) {
        int a = 14;
        int b = 12;

        int d = gcd(a, b);

        System.out.println("LCM : " + ((a/d)*(b/d)*d));
    }

    public static int gcd(int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}
