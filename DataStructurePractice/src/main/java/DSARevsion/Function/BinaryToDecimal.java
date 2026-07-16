package DSARevsion.Function;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binaryToDecimal(n));
    }

    private static int binaryToDecimal(int n) {
        int res = 0;
        int pow2= 1;
        while(n>0){
            int lastDigit = n%10;
            int binary = lastDigit*pow2;
            res= res+binary;
            n = n/10;
          pow2=   pow2*2;

        }
        return res;
    }

}
