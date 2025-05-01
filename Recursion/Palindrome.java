package Recursion;

public class Palindrome {
    static int sum = 0;

    static int  reverse(int n) {
        if (n==0){
            return n;
    }

    int rem = n % 10;
    sum =sum *10+rem;
    reverse(n /10);

        return sum;
    }
static  boolean palindrome(int n){
        sum =0;
        return  n == reverse(n);

}
    public static void main(String[] args){
        System.out.println(palindrome(121));
        System.out.println(palindrome(12341));
        System.out.println(palindrome(12309321));


    }
}
