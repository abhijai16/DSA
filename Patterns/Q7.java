package Patterns;

/*   *****
      ****
       ***
        **
         * */

public class Q7 {
    public static void main(String[] args) {
        int length = 5;
        for(int i=0; i<length; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=length-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
