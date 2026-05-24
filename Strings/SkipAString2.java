package Strings;

//* skip a app if its not apple. */


public class SkipAString2 {
    public static void main(String[] args) {
        String str = "baccapplehgjiappui";
        
        System.out.println(skipAppNotApple(str));
    }    

    public static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }

        return str.charAt(0) + skipAppNotApple(str.substring(1));
    }
}
