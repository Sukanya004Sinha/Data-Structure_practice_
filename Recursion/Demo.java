package Recursion;

public class Demo {
    public static void main(String[] args) {
        message();
    }

        static void message(){
            System.out.println("Hello");
            message1();
        }
    static void message1(){
        System.out.println("Hello");
        message2();
    }
    static void message2(){
        System.out.println("Hello");
        message3();
    }
    static void message3(){
        System.out.println("Hello");
    }
    }

