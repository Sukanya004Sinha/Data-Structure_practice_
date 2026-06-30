package Assignment.basic;

import java.util.Scanner;
//54321
//52134
public class Inverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int inv = 0;
        int pos = 1;
       while(n!=0){
           int lastDig = n%10;
           inv =  inv+pos* (int)(Math.pow(10, lastDig-1));
           n= n/10;
           pos++;


        }
        System.out.println(inv);

    }
}
