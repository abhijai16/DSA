import java.util.Random;

//*  I have created this program for randomly generating LeetCode problems which i can practice daily.

public class RandomDSA{
    public static void main(String[] args) {

        int[] easy = {1, 268, 1480, 1672, 1470, 1431, 1512, 1295, 1365, 832, 1920, 1929, 744, 704, 867, 448, 645, 136, 191, 1342, 3658, 1389, 1832, 1732, 66, 26};
        int[] medium = {75, 189, 34, 852, 162, 33, 1011, 2226, 287, 442, 238, 17, 1985, 167, 15, 16, 31, 48, 11, 54, 59, 49, 1329, 498};
        int[] hard = {41, 1095, 410, 1250, 37, 42};

        //* 56 Questions.

        //* Generating 4 Random LeetCode Problem.

        System.out.println("Question 1: " + getRandom(easy));
        System.out.println("Question 2: " + getRandom(easy));
        System.out.println("Question 3: " + getRandom(medium));
        System.out.println("Question 4: " + getRandom(hard));
    }

    public static int getRandom(int[] arr) {
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        return arr[index];
    }
    
}