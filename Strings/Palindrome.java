package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String a = "abbcbba";
        System.out.println(isPalindrome(a));
    } 

    public static boolean isPalindrome(String str){
        if(str == null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            char start = str.charAt(i);
            char end = str.charAt(j); 
            if(start != end){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
