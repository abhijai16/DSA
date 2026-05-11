package Math;

import java.util.Scanner;

public class XOR_0toA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int a = sc.nextInt();
        sc.close();

        if(a%4==0){
            System.out.println(a);
        }
        else if(a%4==1){
            System.out.println("1");
        }
        else if(a%4==2){
            System.out.println(a+1);
        }
        else{
            System.out.println("0");
        }
    }
}

// It has a pattern
// 0 => 0
// 1 => 1
// 2 => 3
// 3 => 0
// 4 => 4
// 5 => 1
// 6 => 7
// 7 => 0
// 8 => 8
// and so on
