package Strings;

//* In this version new substring is created after every call. */

public class SkipAChar2 {
    public static void main(String[] args) {
        String str = "baccad";
        char skip = 'a';

        System.out.println(skipChar(str, skip));
    }

    public static String skipChar(String str, char skip){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == skip){
            return skipChar(str.substring(1), skip);
        }
        return ch + skipChar(str.substring(1), skip);
    }
}
