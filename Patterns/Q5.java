package Patterns;

/*  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *     */

public class Q5 {
    public static void main(String[] args) {
        int length = 9;
        for(int i=0; i<length; i++){
            if(i<length/2){
                for(int j=0; j<i+1; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=length-i; j>0; j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
