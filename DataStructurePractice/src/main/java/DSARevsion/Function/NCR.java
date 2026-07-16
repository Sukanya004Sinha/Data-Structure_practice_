package DSARevsion.Function;

import java.util.Scanner;

public class NCR {

    public static int factorial(int n ) {
        if(n==0){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int findNCR(int n , int r ){
        if(r>n ||n<0|| r<0){
            return 0;
        }
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmr = factorial(n-r);
        int NCR = nfact/(rfact*nmr);
        return NCR;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(findNCR(n ,r));
    }
}
