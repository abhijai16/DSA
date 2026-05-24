package Strings;

//* No new substring is created, we are using index to traverse the string character. */

public class SkipAChar {
    public static void main(String[] args) {
        String str = "baccad";
        char skip = 'a';

        System.out.println(skipChar(str, skip, 0));
    }

    public static String skipChar(String str, char skip, int index){
        if(index==str.length()){
            return "";
        }
        if(str.charAt(index)==skip){
            return skipChar(str, skip, index+1);
        }
        return str.charAt(index) + skipChar(str, skip, index+1);
    }
}
