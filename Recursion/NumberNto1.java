package Recursion;

public class NumberNto1 {
    public static void main(String[] args) {
        int n = 5;
        numberPrint(n);
    }

    public static void numberPrint(int start){
        if(start == 0){
            return;
        }
        System.out.println(start);
        numberPrint(start-1);
    }
}
