package DSAPractice.Functions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binaryNum=   sc.nextInt();
        System.out.println(convertToDecimal(binaryNum));

    }
    public static int convertToDecimal(int binaryNum) {
        int res = 0;
        int pow2 = 1;
        while(binaryNum>0){
            int lastDigit = binaryNum%10;
            int binary = lastDigit*pow2;
            res= res+binary;
            binaryNum/=10;
            pow2 = pow2*2;
        }

return res;
    }
    }
