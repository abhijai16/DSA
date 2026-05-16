package Algorithms;

//* Used to calculate the square root of a number. */

public class NewtonRaphson {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(n));
    }
    
    public static double sqrt(int num){
        double x = num;
        double root;

        while(true){
            root = 0.5 * (x + (num/x));
            if(Math.abs(root-x)<0.00001){  //error checking.
                break;
            }
            x = root;
        }
        return root;
    }
}
