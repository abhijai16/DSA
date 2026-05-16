package Recursion;

public class DigitProduct {
    public static void main(String[] args) {
        int num = 9339;
        System.out.println(productDigit(num));
    }

    public static int productDigit(int n){
        if(n%10 == n){
            return n;
        }

        return n%10 * (productDigit(n/10));
    }
}
