package AllSbcCodingQue;

public class isSubsequence {

    public static boolean isSubsequence( String S1 , String S2){

        int i= 0;
        int j= 0 ;

        while( i < S1.length() && j < S2.length()){

            if ( S1.charAt(i) == S2.charAt (j)){

                i++;
                j++;

            } else{
                j++;
            }
        } return( i == S1.length());

    }
    public static void main(String[] args) {
        String s1 = " abc";
        String s2 =  " ahbgdc";
        System.out.println( isSubsequence( s1,s2));


    }
}
