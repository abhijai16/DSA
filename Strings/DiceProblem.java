package Strings;
import java.util.*;

public class DiceProblem {
    public static void main(String[] args) {
        int target = 4;

        List<String> list = dicePossibility("", target);
        System.out.println(list);
    }

    public static List<String> dicePossibility(String possible, int target){
        List<String> list = new ArrayList<>();
        if(target == 0){
            list.add(possible);
            return list;
        }

        for(int i=1; i<=6 && i<=target; i++){
            List<String> internal = dicePossibility(possible+i, target-i);
            list.addAll(internal);
        }
        return list;
    }
}
