package Math;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 40;
        int m = 45;

        factors1(n);
        factors2(m);
        factors3(m);
    }

    //Time Complexity O(n), space complexity constant.
    public static void factors1(int num){
        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Time Complexity  O(sqrt n), space complexity constant. //* Problem => Not in order. */
    public static void factors2(int num){
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                if(num/i==i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " " + num/i + " ");
                }
            }
        }
        System.out.println();
    }

    //Time Complexity O(sqrt n), space complexity O(sqrt n). //* In order */
    public static void factors3(int num){
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                if(num/i==i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(num/i);
                }
            }
        }
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
