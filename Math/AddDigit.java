package Math;

//* Leetcode problem 258.
// Add all the digit until it end up in single digit.  258 = 2+5+8 = 15 = 1+5 = 6 ans.

public class AddDigit {
    public static void main(String[] args) {
        int num = 258;
        int ans = 0;

        int digit = (int)(Math.log10(num))+1;
        if(digit == 1 || num==0){
            ans = num;
        }
        else{
            int sum = num%9;
            ans = sum==0 ? 9 : sum;
        }
        System.out.println(ans);
    }
}
//! Theory = When we divide 9 with the number the reminder is out answer, exception is remainder 9 is not possible as it will give 0 result when divided by 9.
