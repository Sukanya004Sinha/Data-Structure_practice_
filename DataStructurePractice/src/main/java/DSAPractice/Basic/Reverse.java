package DSAPractice.Basic;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
//        int rev = 0;
//        while (n!=0){
//            int lastDig = n%10; //fetch last Digit
//        rev= rev*10+lastDig; //attach last digit at the end
//        n=n/10; //remove last digit
//
//        }
//        System.out.println(rev);
        int rev = 0;
        while(n!=0){
            int lastDig = n%10;
           rev= rev*10+lastDig;
           n=n/10;
        }
        System.out.println(rev);
    }

}
