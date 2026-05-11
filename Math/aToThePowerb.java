package Math;

public class aToThePowerb {
    public static void main(String[] args) {
        int base = 3;
        int power = 4; // 100
        int ans = 1;

        while(power>0){
            int digit = power & 1;
            power = power>>1;
            if(digit==1){
                ans *= base;
            }
            base = base*base;

        }
        System.out.println(ans);
    }
}
