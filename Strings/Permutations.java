package Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";

        ArrayList<String> list = permutation("", str);
        System.out.println(list);
    }

    public static ArrayList<String> permutation(String processed, String unprocessed){
        ArrayList<String> list = new ArrayList<>();
        if(unprocessed.isEmpty()){
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);
        for(int i=0; i<=processed.length(); i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());

            ArrayList<String> internal = permutation(first+ch+second, unprocessed.substring(1));
            list.addAll(internal);
        }
        return list;
    }
}
