import java.util.Random;

//**  I have created this program for randomly generating LeetCode problems which i can daily practice.

public class RandomDSA{
    public static void main(String[] args) {

        int[] arr = {1, 189, 268, 1920, 1929, 1480, 1672, 1470, 1431, 1512, 1295};


        //**Generating 2 Random LeetCode Problem.

        System.out.println("Question 1: " + getRandom(arr));
        System.out.println("Question 2: " + getRandom(arr));
    }

    public static int getRandom(int[] arr) {
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        return arr[index];
    }

}