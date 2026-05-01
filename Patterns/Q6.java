package Patterns;

/*       *
        **
       ***
      ****
     ***** */

public class Q6 {
    public static void main(String[] args) {
        int length = 5;
        for(int i=0; i<length; i++){
            for(int j=length-1-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
