package Array;
import java.util.Scanner;
/*
    * Leetcode Problem set 1295.
    * Given an array nums of integers, return how many of them contain an even number of digits.
    * Just practicing the logic used.
*/

public class CountingDigits {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Input a number to check number of digits: ");
       int num = sc.nextInt();


       //* log10 gives 0.__ for number between 1-9.
       //*       gives 1.__ for number between 10-99.
       //*       gives 2.__ for number between 100-999.
       //* so for number of digits we add 1 and since log gives a decimal number so we convert it into integer. */
       int digits =(int)Math.log10(num) + 1;

       System.out.println("Digits: " + digits);
       
       sc.close();
   }
}
