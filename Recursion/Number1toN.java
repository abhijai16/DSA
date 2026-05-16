package Recursion;

//* Write a recursive function to print number from 1 to n. */

public class Number1toN {
    public static void main(String[] args) {
        printNumber(5);
    }

    public static void printNumber(int end){
        if(end == 0){
            return;
        }
        printNumber(end-1);
        System.out.println(end);
    }
}
