package BitManipulation;

public class SwapVariablesUsingXOR {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        a = a^b;  
        b = a^b;   // (a^b)^b == a  therefore b = a now;
        a = a^b;   // (a^b)^a == b  a = b now;

        System.out.println(a);
        System.out.println(b);
    }
}
