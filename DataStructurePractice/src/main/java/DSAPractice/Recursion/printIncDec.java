package DSAPractice.Recursion;

public class printIncDec {


        public static void main(String[] args) {
            printIncDec(5);
        }

        public static void printIncDec(int n) {
            if(n==1){
                System.out.println(n);
                return;
            }

            System.out.println(n);
            printIncDec(n - 1);
            System.out.println(n);
        }
    }

