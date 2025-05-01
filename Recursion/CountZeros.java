package Recursion;

public class CountZeros {
    static int count = 0;

    static int countZero(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        if(rem==0){
            count++;
        }
        countZero(n/10);
      return count;
    }


    static int countZeros1(int n) {
        return helper(n, 0);
    }
    static int helper(int n , int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if (rem==0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
    public static void  main(String[] args){
        count =0;
        System.out.println(countZero(120304));
        count =0;
        System.out.println(countZero(121354));
        count =0;
        System.out.println(countZero(123304));

        System.out.println(countZeros1(123344));

    }
}
