package Recursion;

public class Nt01 {
    public static void main(String[] args) {
        int n = 5;
       // print(n);
        print1(n);
    }
    //Concept
  //  (--n) // Pre decrement
    // (n--) // Post  infinite loop
    public static void print ( int n)
    {
        if( n==0) {
            return;
        }

            System.out.println(n);
            print(n-1);
        }
    public static void print1 ( int n)
    {
        if( n==0) {
            return;
        }
        print1(n-1);
        System.out.println(n);

    }
    }
