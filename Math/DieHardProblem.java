package Math;

public class DieHardProblem {
    public static void main(String[] args) {
        int jugA = 3;
        int jugB = 6;
        int target = 9;

        if(possible(jugA, jugB, target)){
            System.out.println("Possible");
        }
        else{
            System.out.println("Not Possible");
        }
    }

    public static boolean possible(int a, int b, int target){
        if(target > Math.max(a, b)){
            return false;
        }
        
        return (target%gcd(a, b) == 0);
    }

    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
