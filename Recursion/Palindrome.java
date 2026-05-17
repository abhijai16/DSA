package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1234321;
        if(n == rev(n, 0)){
            System.out.println("Palindrome.");
        }
        else{
            System.out.println("Not Palindrome.");
        }
    } 

    public static int rev(int n, int revNum){
        if(n==0){
            return revNum;
        }
        revNum = revNum*10 + n%10;
        return rev(n/10, revNum);
    }
}
