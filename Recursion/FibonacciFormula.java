package Recursion;

public class FibonacciFormula {
    public static void main(String[] args) {
        for(int i=0; i<11; i++){
            System.out.println(i+"`: "+fibo(i));
        }
        System.out.print("Fibonacci of 50 is: ");
        System.out.println(fibo(50));
    }

    public static int fibo(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5));
    }
}
