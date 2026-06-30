package Assignment.basic;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int len = 0;
        int temp = n;
        while (temp != 0) {
            len++;
            temp = temp / 10;
        }
        k = k % len;
        if (k < 0) {
            k = k + len;
        }
        int div = (int) Math.pow(10, k);
        int mul = (int) Math.pow(10, len - k);
        int lastDig = n % div;
        int frontDig = n / div;

        int rotatedNum = lastDig*mul +frontDig;
        System.out.println(rotatedNum);
    }
}


