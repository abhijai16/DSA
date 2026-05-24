package Strings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";

        ArrayList<String> list = subset("", str);
        System.out.println(list);
    }

    public static ArrayList<String> subset(String processed, String unprocessed){
        ArrayList<String> list = new ArrayList<>();
        if(unprocessed.isEmpty()){
            list.add(processed);
            return list;
        }   

        char ch = unprocessed.charAt(0);

        ArrayList<String> ans1 = subset(processed+ch, unprocessed.substring(1));
        ArrayList<String> ans2 = subset(processed, unprocessed.substring(1));
        list.addAll(ans1);
        list.addAll(ans2);
        return list;
    }
}
