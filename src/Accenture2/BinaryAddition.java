package Accenture2;
import java.util.*;


public class BinaryAddition {


    public static String binaryAddition( String A , String B){
        int a = Integer.parseInt(A, 2);
        int b = Integer.parseInt(B,2);

        int sum =  a+b;
        String ans = Integer.toBinaryString( sum );
        return ans ;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);

        String binary1 =  sc.nextLine();
        String binary2 =  sc.nextLine();

        System.out.println(binaryAddition(binary1,binary2));



    }
}
