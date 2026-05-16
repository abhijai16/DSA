package Recursion;

public class ReverseNumber {

    static int sum = 0;

    public static void reverse(int n){
        if(n == 0){
            return;
        }
        sum = sum * 10 + n % 10;
        reverse(n/10);
    }

    public static void main(String[] args) {
        int num = 1234;
        reverse(num);
        System.out.println(sum);
    }
}
