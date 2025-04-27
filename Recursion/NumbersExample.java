package Recursion;

/**
 * function calling itself
 * All the function calls that happened in the programming languages they go into the stack memory.
 *
 */
public class NumbersExample {
    public  static void main(String [] args){
        print(1);
    }
    static void print(int n){
//        if(n==0){
//            return;
//        }
        System.out.println(n);
        print1(2);
    }
    static void print1(int n){
        System.out.println(n);
        print2(3);

    }
    static void print2(int n){
        System.out.println(n);
        print3(4);

    }
    static void print3(int n){
        // THIS IS CALLED TAIL RECURSION
        // THIS IS THE LAST FUNCTION CALL

        System.out.println(n);


    }
}
