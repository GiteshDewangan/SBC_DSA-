package AllSbcCodingQue.Recursion;

public class fibonacci {
      static int fib(int n){
          // base case

          if(n==0 || n==1 ){
              return 0;
          }

          // subproblem = rucursive work

          int prev = fib(n-1);
          int PrevPrev = fib( n-2);


          // self work

          return prev + PrevPrev;

      }


    public static void main(String[] args) {
        System.out.println(5);
    }
}
