package Recursion;

public class CountZeroes{
    public static void main(String[] args) {
        int num = 3040205;

        System.out.println(count0(num, 0));
    }

    public static int count0(int n, int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
        }
        return count0(n/10, count);
    }
}
