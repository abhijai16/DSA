package Patterns;

/*       *
        * *
       * * *
      * * * *
     * * * * *    */

public class Q10 {
    public static void main(String[] args) {
        int length = 5;
        for(int i=0; i<length; i++){
            for(int j=0; j<length-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                if(j%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
