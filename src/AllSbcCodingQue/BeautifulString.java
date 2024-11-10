package AllSbcCodingQue;

import java.util.*;

public class BeautifulString {

    public static String generate( int n, boolean zeroStart){
          StringBuilder ans = new StringBuilder();
        if( n == 0 ) return ans.toString();
        if(zeroStart){
            ans.append('0') ; n--;
        }else{
            ans.append('1') ; n--;
        }

        while( n!= 0){
            char temp = (ans.charAt( ans.length() - 1) == '0') ? '1': '0';
            ans.append(temp);
            n--;
        }
        return ans.toString();
    }
     public static int  diff( String s , String g, int n){

        int ans = 0;

        for(int i = 0 ; i < n; i++){

            if( s.charAt(i)!= g.charAt(i)) {
                ans++;
            }
        }

        return ans;

     }

    public static int MakeBeautiful(String str){

        int n =str.length();

        String g1 = generate(n,true);
        int diff1  =  diff( str , g1 , n);

        String g2 = generate(n,false);
        int diff2  =  diff( str , g2, n);

        return Math.min(diff1,diff2);


    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        String str = sc.next();

       System.out.println(MakeBeautiful(str));

        sc.close();

    }
}
