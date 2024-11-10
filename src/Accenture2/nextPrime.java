package Accenture2;
import java.util.*;


public class nextPrime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;  // numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;  // if divisible, not a prime
            }
        }
        return true;
    }



    public static int nextPrime(int n) {
        int next = n + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;  // return the first prime found after n
    }


    public static boolean last( int a , int b){


        if (!isPrime(a) || !isPrime(b)) {
            return false ;
        }  ;
        return b == nextPrime(a);
    }


//    public static boolean solve(int A, int B) {
//        if (!isPrime(A)) {
//            return false;  // A is supposed to be a prime number, so check it
//        }
//        int nextPrimeAfterA = nextPrime(A);
//        return B == nextPrimeAfterA;  // check if B is the next prime after A
//    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
        if ( last(a,b)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }






    }
}
