package Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 2.3455f;

        System.out.printf("Formatted number is %.2f.\n", a);

        System.out.println(Math.PI);

        System.out.printf("Pi : %.3f\n", Math.PI); //default rounding of happens.

        System.out.printf("Hello my name is %s and I am %d years old.\n", "Abhijai", 20);
    }
}
