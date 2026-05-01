package Recursion;

//* Write a recursive function to print number from 1 to n. */

public class NumberPrinting {
    public static void main(String[] args) {
        printNumber(1, 5);
    }

    public static void printNumber(int start, int end){
        if(start == end){
            System.out.println(start);
            return;
        }
        System.out.println(start);
        printNumber(start+1, end);
    }
}
