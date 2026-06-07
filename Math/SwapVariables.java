package Math;

public class SwapVariables {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        a = a+b;  // a = 8
        b = a-b;  // b = 8-5 = 3
        a = a-b;  // a = 8-3 = 5;

        System.out.println(a);
        System.out.println(b);
    }
}
