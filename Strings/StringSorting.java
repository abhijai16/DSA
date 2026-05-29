package Strings;

import java.util.*;

public class StringSorting {
    public static void main(String[] args) {
        String str = "trwsacvefop";

        str = sort(str);
        System.out.println(str);
    }

    public static String sort(String temp){
        char[] arr = temp.toCharArray();
        Arrays.sort(arr);
        temp = new String(arr);
        return temp;
    }
}
