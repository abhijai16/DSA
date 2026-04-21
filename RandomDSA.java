import java.util.Random;

//**  I have created this program for randomly generating Leetcode problems which i can daily practice.

public class RandomDSA{
    public static void main(String[] args) {

        int[] arr = {1, 189, 268, 1920, 1929, 1480, 1672};


        //**Generating 2 Random Leetcode Problem.

        System.out.println(getRandom(arr));
        System.out.println(getRandom(arr));
    }

    public static int getRandom(int[] arr) {
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        return arr[index];
    }

}