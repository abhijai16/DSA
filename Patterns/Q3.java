package Patterns;

/*  *****
    ****
    ***
    **
    *   */

public class Q3 {
    public static void main(String[] args) {
        int length = 5;
        for(int i=0; i<length; i++){
            for(int j=length-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
