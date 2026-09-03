package DSAPractice.Recursion.WayDown;

public class PrintStair {
    public static void printStairPaths(int n, String ps){
        if(n < 0){
            return;
        }

        if(n == 0){
            System.out.println(ps);
            return;
        }

        printStairPaths(n-1, ps + "1");
        printStairPaths(n-2, ps + "2");
        printStairPaths(n-3, ps + "3");
    }



}
