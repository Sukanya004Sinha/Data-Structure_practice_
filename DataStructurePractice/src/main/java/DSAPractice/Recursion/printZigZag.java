package DSAPractice.Recursion;

public class printZigZag {
    public static void main(String[] args) {
        printZigZag(3);
    }


    public static void printZigZag(int n) {
        if (n == 0) return;
        System.out.print(n);
        printZigZag(n - 1);
        System.out.print(n);
        printZigZag(n - 1);
        System.out.print(n);

    }
}
