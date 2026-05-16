package Math;

public class LCM {
    public static void main(String[] args) {
        int a = 14;
        int b = 28;

        int d = gcd(a, b);

        System.out.println("LCM : " + (a*b)/d);
    }

    public static int gcd(int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}
