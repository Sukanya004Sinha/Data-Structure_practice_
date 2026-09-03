package DSAPractice.Recursion;

public class printDecreasing {

    public static void printDescreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDescreasing(n-1);


}

    public static void main(String[] args) {
        printDescreasing(6);
    }

}
