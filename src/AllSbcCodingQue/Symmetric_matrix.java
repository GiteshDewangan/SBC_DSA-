package AllSbcCodingQue;
import java.util.*;
public class Symmetric_matrix  {


    public static void main(String[] args) {

        int a[][]=  new int[3][3],f=0;

        Scanner sc =  new Scanner(System.in);

        System.out.println( "Enter Matrix Elements :" );
        for( int i = 0 ; i< 3;i++){
            for( int j=0 ; j< 3 ; j++){

                System.out.print("Enter Elements in pocket["+i+"]["+j+"]  :");
                a[i][j] = sc.nextInt() ;

            }


        }
        System.out.println( "Matrix is .....");

        for( int i = 0 ; i < 3; i++){
            for( int j = 0 ; j<3 ; j++){

                System.out.print( a[i][j] + " ");
            }

            System.out.println();
        }



        for( int i = 0 ; i < 3; i++){
            for( int j = 0 ; j<3 ; j++){

                if (a[i][j] != a[j][i]) {
                    f =1;
                    break;
                }

            }
        }

        if (f==0 ){
            System.out.println( " Matrix is symmetric");


        }




    }
}
