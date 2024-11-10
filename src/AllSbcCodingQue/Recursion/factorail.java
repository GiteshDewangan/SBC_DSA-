package AllSbcCodingQue.Recursion;

import com.sun.jdi.PathSearchingVirtualMachine;

public class factorail {
      static int factorial(int n){


          //base case
          if(n==0) return 1;
          // smaller problem - recursive work

          //big problem - self work
          int ans = n * factorial(n-1);
          return ans;



      }

    public static void main(String[] args) {

    }
}
