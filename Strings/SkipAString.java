package Strings;

public class SkipAString {
    public static void main(String[] args) {
        String str = "baacfapplecdiuac";
        String skip = "apple";

        System.out.println(skipString(str, skip));
    }

    public static String skipString(String str, String skip){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith(skip)){
            return skipString(str.substring(skip.length()), skip);
        }
        return str.charAt(0) + skipString(str.substring(1), skip);
    }
}
