package Math;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        sc.close();
        
        if(n<2){
            System.out.println("Not Prime.");
            return;
        }

        boolean isPrime= true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isPrime=false;
                break; 
            }
        }

        if(isPrime) System.out.println("The given number is Prime.");
        else System.out.println("Not Prime.");
    }
}
