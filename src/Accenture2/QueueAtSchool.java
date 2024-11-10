package Accenture2;
import java.sql.SQLOutput;
import java.util.Scanner;


public class QueueAtSchool {
    public static void main(String[] args) {

        Scanner sc =  new Scanner( System.in);
        int n  = sc.nextInt();
        int t  =  sc.nextInt();
        String s = sc.nextLine();
        char[] arr =  s.toCharArray();


        while( t>0){

            for( int i = 0;  i< n-1 ; i++){

                if( arr[i]=='B' && arr[i+1] == 'G'){
                    char temp  = arr[i];
                       arr[i] = arr[i+1];
                       arr[i+1] = temp ;
                    System.out.println( i);
                       i++;
                    System.out.println( i);
                }
                System.out.println(i);
            }
            ;
            t--;

        }
        System.out.println(new String(arr));

    }
}

//Scanner scanner = new Scanner(System.in);
//
//int n = scanner.nextInt(); // Number of characters
//int t = scanner.nextInt(); // Number of time units
//
//String s = scanner.next(); // The string of characters
//
//char[] arr = s.toCharArray(); // Convert string to char array
//
//// Simulate the process for t time units
//        for (int time = 0; time < t; time++) {
//        for (int i = 0; i < n - 1; i++) {
//        // Swap 'B' and 'G'
//        if (arr[i] == 'B' && arr[i + 1] == 'G') {
//char temp = arr[i];
//arr[i] = arr[i + 1];
//arr[i + 1] = temp;
//i++; // Skip the next index to avoid double swapping in one time unit
//        }
//        }
//        }
//
//        // Convert char array back to string and print it
//        System.out.println(new String(arr));
//        scanner.close();