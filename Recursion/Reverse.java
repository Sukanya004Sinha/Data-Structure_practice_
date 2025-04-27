package Recursion;

public class Reverse {
    static int sum = 0;

    public static void rev(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);

    }
    public static int rev1(int n){
        //Sometimes you might need some additional variables in the arguments in that case make another function

        if(n==0){
            return n;
        }
        int rem = n%10;
        int digits =(int) Math.log10(n)+1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n) return n;
        int rem = n%10;
        return (int) (rem* Math.pow(10,digits-1)) + helper(n/10, digits-1) ;
}

    public static void main(String[] args) {
        int n = 18249908;
        rev(n);
        System.out.println(sum);
        rev1(n);

    }


}
