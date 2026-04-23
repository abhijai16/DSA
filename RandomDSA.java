import java.util.Random;

//**  I have created this program for randomly generating LeetCode problems which i can daily practice.

public class RandomDSA{
    public static void main(String[] args) {

        int[] arr = {1, 189, 268, 1920, 1929, 1480, 1672, 1470, 1431, 1512, 1295, 1365, 41, 75, 832};

        //*  After solving some more medium and hard questions, will generate the numbers based on each level.
        // int[] easy = {1, 268, 1480, 1672, 1470, 1431, 1512, 1295, 1365, 832, 1920, 1929};
        // int[] medium = {75, 189, 41};
        // int[] hard = {41};

        //* 15 Questions.

        //**Generating 3 Random LeetCode Problem.

        System.out.println("Question 1: " + getRandom(arr));
        System.out.println("Question 2: " + getRandom(arr));
        System.out.println("Question 3: " + getRandom(arr));
    }

    public static int getRandom(int[] arr) {
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        return arr[index];
    }

}