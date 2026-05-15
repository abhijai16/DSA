package Math;

public class PerfectSqrt{
    public static void main(String[] args) {
        int n = 64;
        System.out.println(sqrt(n));
    }

    public static int sqrt(int num) {
        int start = 0;
        int end = num;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;
    
            if(square == num) {
                return mid;
            }
            else if(square < num) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return end;
    }
}