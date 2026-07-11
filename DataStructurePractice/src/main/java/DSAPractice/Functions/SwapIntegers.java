package DSAPractice.Functions;

public class SwapIntegers {
    public static void swap(int a,int b){
        int temp = a;
        a= b;
        b= temp;
    }
    public static void main(String[] args) {
        int a = 10, b = 11;
        System.out.println(a+ "," +b);
       swap(a, b);
        System.out.println(a+ "," +b);
    }
}

//Jaise is Swap function memory se delte hua uski Swap values bhi delete
// ho gyi isliye iski values same hi print ho gi
