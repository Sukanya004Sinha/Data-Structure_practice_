package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sum(n));
        System.out.println(prod(n));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) +sum(n/10);
    }
    public static int prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) *prod(n/10);
    }
}
