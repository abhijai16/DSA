package Array;
import java.util.HashMap;

//* To calculate the frequency of 1 in an array using HashMap. */
 
public class Frequency {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 3, 1, 4};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map.get(1));
    }
}
