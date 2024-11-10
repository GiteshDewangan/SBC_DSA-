package Accenture2;
import java.util.*;

public  class MatrixCentreMove {

    static final int N = 5;

    public static int move( int[][] matrix){

        int Ci =  N/2 , Cj = N/2;

        int oneI = 0, oneJ = 0;

        for ( int i =  0 ; i < N ; i++){
            for ( int j = 0 ; j < N ; j++){
                if( matrix[i][j] == 1){

                    oneI = i; oneJ = j;

                }

            }

        }

        int ans =  Math.abs(Ci - oneI) + Math.abs(Cj - oneJ);




        return ans;
    }

    public static void main(String[] args) {

        int[][] matrix =  {  {0,0,0,0,0},
                             {0,0,0,0,0},
                             {0,0,0,0,0},
                             {0,0,0,0,0},
                             {0,0,0,1,0}
                                };
        System.out.println( move(matrix));




    }

}
