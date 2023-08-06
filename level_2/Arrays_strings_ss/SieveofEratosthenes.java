import java.util.*;
class SieveOfEratosthenes{
    public static void printPrimeUsingSieve(int n){
        boolean[] isPrime= new boolean[n+1];
        Arrays.fill(isPrime, true); // for each places we need to mark true first
        for(int i=2;i*i<= isPrime.length;i++){
            if(isPrime[i]==true){
                //making multiples not prime 
                for(int j=2*i;j<isPrime.length;j+=i){
                    isPrime[j] = false; //not prime
                }
            }

        }

        // print all prime til n 
        for(int i = 2;i<isPrime.length;i++){
            if(isPrime[i] == true){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeUsingSieve(n);
        
    }
}