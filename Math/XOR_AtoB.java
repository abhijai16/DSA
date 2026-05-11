package Math;

// XOR from range a to b is equal to  =>   (XOR from 0 to b)^(XOR from 0 to a-1)

public class XOR_AtoB {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        
        int ans = XOR(b) ^ XOR(a-1);
        System.out.println(ans);
    }
    public static int XOR(int num){
        if(num%4==0){
            return num;
        }
        else if(num%4==1){
            return 1;
        }
        else if(num%4==2){
            return num+1;
        }
        else{
            return 0;
        }
    }
}
