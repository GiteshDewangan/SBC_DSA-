package Accenture2;

public class floydTriangle {

    public static void floydTriangle( int N){
           int count = 1;
        for ( int i = 0 ; i< N; i++ ) {
            for (int j = 0; j <= i; j++){
                System.out.print( count++);
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
           floydTriangle(5);
    }
}
