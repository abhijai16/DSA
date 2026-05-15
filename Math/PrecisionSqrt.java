package Math;

public class PrecisionSqrt {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;
        System.out.println(sqrt(n, precision));
    }

    public static double sqrt(int num, int precision) {
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
        double root = end;
        double increment = 0.1;

        for(int i=0; i<precision; i++){
            while(root * root <= num){
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }
}
