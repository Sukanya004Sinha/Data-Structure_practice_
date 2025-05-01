package Recursion;

import java.util.Scanner;

public class PowerXn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();;
        System.out.println(power(x,n));

    }
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int xnm = power(x, n-1);
        int xn = x* xnm;
        return xn;
    }
}
