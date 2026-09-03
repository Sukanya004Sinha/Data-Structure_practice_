package DSAPractice.Recursion;

public class PowerXmn {
    public static void main(String[] args) {
        System.out.println( xpowern(2,3));

    }
    public static int xpowern(int x, int n){
        if(n==0){
            return 1;
        }
        int ans = 0;
        int sp = (int) xpowern(x, n - 1);
        ans = x*sp;


        return ans;
    }

}

