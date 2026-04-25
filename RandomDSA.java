import java.util.Random;

//*  I have created this program for randomly generating LeetCode problems which i can practice daily.

public class RandomDSA{
    public static void main(String[] args) {

        int[] easy = {1, 268, 1480, 1672, 1470, 1431, 1512, 1295, 1365, 832, 1920, 1929, 744, 704, 867};
        int[] medium = {75, 189, 41, 34, 852, 162, 33, 1011, 2226};
        // int[] hard = {41, 1095, 410};

        //* 26 Questions.

        //* Generating 3 Random LeetCode Problem.

        System.out.println("Question 1: " + getRandom(easy));
        System.out.println("Question 2: " + getRandom(easy));
        System.out.println("Question 3: " + getRandom(medium));
    }

    public static int getRandom(int[] arr) {
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        return arr[index];
    }

}