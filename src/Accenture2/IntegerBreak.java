package Accenture2;

public class IntegerBreak {

    public static int integerBreak(int n) {

        if( n <= 3 && n!= 1){
            return n-1;
        }

        int quotient = n/3;
        int remainder =  n%3;

        if( remainder == 0){
            return (int)Math.pow( 3, quotient);
        } else if ( remainder == 1) {
            return (int)Math.pow(3 , quotient - 1) *4;
        } else {
            return (int) Math.pow(3, quotient) *2;
        }


    }

    public static void main(String[] args) {
        System.out.println( integerBreak(10));

    }





}
