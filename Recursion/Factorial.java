package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(fact(num));
    }
    
    public static long fact(int n){
        if(n<0){
            return -1;
        }
        if(n<2){
            return 1;
        }
        return n*fact(n-1);
    }
}
