package Math;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if((num&1) == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}

// The number is odd or even is determined by its least significant bit(last position)  => 10001
// If LSB = 1 (Odd)  ,  LSB = 0 (Even)
// Any odd number when AND with 1 gives 1.    =>  10001 & 00001 = 1
// Any even number when AND with 1 gives 0.   =>  11000 & 00001 = 0

